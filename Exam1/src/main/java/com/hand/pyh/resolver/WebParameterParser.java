package com.hand.pyh.resolver;

import com.hand.pyh.annotation.ConvertPage;
import com.hand.pyh.bean.Page;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

public class WebParameterParser implements HandlerMethodArgumentResolver {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        if (parameter.getParameterType().isAssignableFrom(Page.class) && parameter.hasParameterAnnotation(ConvertPage.class)) {
            logger.warn("自定义注解支持");
            return true;
        }
        return false;
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
        String pageSize = webRequest.getParameter("pageSize");
        String page = webRequest.getParameter("page");
        Page pageobject;
        if (page != null && pageSize != null) {
            if (!page.equals("") && !pageSize.equals("")) {
                pageobject = new Page();
                pageobject.setPage(Integer.parseInt(page));
                pageobject.setPageSize(Integer.parseInt(pageSize));
                return pageobject;
            } else {
                throw new Exception("can't get properties those are non-value");
            }
        } else {
            throw new Exception("do not get page And pageSize properties");
        }

    }
}
