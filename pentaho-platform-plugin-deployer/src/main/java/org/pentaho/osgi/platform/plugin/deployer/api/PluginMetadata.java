/*! ******************************************************************************
 *
 * Pentaho Data Integration
 *
 * Copyright (C) 2002-2014 by Pentaho : http://www.pentaho.com
 *
 *******************************************************************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ******************************************************************************/

package org.pentaho.osgi.platform.plugin.deployer.api;

import org.w3c.dom.Document;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by bryan on 8/26/14.
 */
public interface PluginMetadata {
  public ManifestUpdater getManifestUpdater();

  public Document getBlueprint();

  public void writeBlueprint( OutputStream outputStream ) throws IOException;
}
