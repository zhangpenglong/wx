package com.huixiangfu.core.exception;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 拦截异常,引导用户到友好页面,并根据配置给相关人员发送邮件或者短信
 * 
 * @author dongao
 * @version 1.0
 * @date 2013-11-19 17:35:56
 */
@SuppressWarnings("unchecked")
public class CustomSimpleMappingExceptionResolver extends SimpleMappingExceptionResolver {

	@Override
	protected ModelAndView doResolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {
		return new ModelAndView("exception/error");
	}


}