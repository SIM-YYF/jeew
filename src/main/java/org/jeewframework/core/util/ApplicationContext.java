package org.jeewframework.core.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by yuanwenfei on 2015/5/13.
 */
public class ApplicationContext implements ApplicationContextAware {
    private static org.springframework.context.ApplicationContext context;
    @Override
    public void setApplicationContext(org.springframework.context.ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    public static org.springframework.context.ApplicationContext getContext() {
        return context;
    }

}
