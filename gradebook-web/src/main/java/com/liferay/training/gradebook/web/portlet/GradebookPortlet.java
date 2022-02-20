package com.liferay.training.gradebook.web.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.training.gradebook.web.constants.GradebookPortletKeys;
import org.osgi.service.component.annotations.Component;

import javax.portlet.Portlet;

/**
 * @author Liferay
 */
@Component(
        immediate = true,
        property = {
                "com.liferay.portlet.display-category=category.training",
                "com.liferay.portlet.instanceable=false",
                "javax.portlet.init-param.template-path=/",
                "javax.portlet.init-param.view-template=/view.jsp",
                "javax.portlet.init-param.add-process-action-success-action=false",
                "javax.portlet.name=" + GradebookPortletKeys.Gradebook,
                "javax.portlet.resource-bundle=content.Language",
                "javax.portlet.security-role-ref=power-user,user"
        },
        service = Portlet.class
)
public class GradebookPortlet extends MVCPortlet {
}