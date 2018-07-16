/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.bootstrap.dialog;

import com.jwebmp.Page;
import com.jwebmp.PageConfigurator;
import com.jwebmp.plugins.PluginInformation;

/**
 * @author GedMarc
 * @since 19 Feb 2017
 */
@PluginInformation(pluginName = "Bootstrap Dialog",
		pluginUniqueName = "bootstrap-dialog",
		pluginDescription = "The Bootstrap Dialog widget for Bootstrap",
		pluginVersion = "BS3.3.7 / 4a6",
		pluginDependancyUniqueIDs = "jquery,bootstrap",
		pluginCategories = "bootstrap,web ui,ui,framework",
		pluginSubtitle = "Make use of Bootstrap's modal more monkey-friendly.",
		pluginGitUrl = "https://github.com/GedMarc/JWebSwing-BootstrapDialog",
		pluginSourceUrl = "https://github.com/EugenMayer/bootstrap-dialog",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-BootstrapDialog/wiki",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/BootstrapDialogPlugin.jar/download",
		pluginIconUrl = "bower_components/bootstrap3-dialog/bootstrap_dialog_icon.jpg",
		pluginIconImageUrl = "bower_components/bootstrap3-dialog/bootstrap_dialog_logo.jpg",
		pluginLastUpdatedDate = "2017/03/04")
public class BSDialogPageConfigurator
		extends PageConfigurator
{

	private static final long serialVersionUID = 1L;

	public BSDialogPageConfigurator()
	{
		super();
		setSortOrder(150);
	}

	@Override
	@SuppressWarnings("unchecked")
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			page.getBody()
			    .getJavascriptReferences()
			    .add(BSDialogReferencePool.BootstrapDialogReference.getJavaScriptReference());
			page.getBody()
			    .getCssReferences()
			    .add(BSDialogReferencePool.BootstrapDialogReference.getCssReference());
		}

		return page;
	}
}