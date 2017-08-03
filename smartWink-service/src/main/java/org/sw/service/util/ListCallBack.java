package org.sw.service.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("listCallBack")
@Scope("prototype")
public class ListCallBack extends SWCallBack{
	private static final Logger LOGGER = LoggerFactory.getLogger(ListCallBack.class);
}
