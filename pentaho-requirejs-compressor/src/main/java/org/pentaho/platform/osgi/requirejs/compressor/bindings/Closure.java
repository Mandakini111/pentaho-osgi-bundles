/*
 * This program is free software; you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License, version 2.1 as published by the Free Software
 * Foundation.
 *
 * You should have received a copy of the GNU Lesser General Public License along with this
 * program; if not, you can obtain a copy at http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html
 * or from the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * Copyright 2014 Pentaho Corporation. All rights reserved.
 */

package org.pentaho.platform.osgi.requirejs.compressor.bindings;

import java.util.HashMap;

/**
 * Created by nbaker on 10/3/14.
 */
public class Closure {

  HashMap<String, Object> compilerOptions;
  String compilationLevel;
  String loggingLevel;

  public HashMap<String, Object> getCompilerOptions() {
    return compilerOptions;
  }

  public void setCompilerOptions( HashMap<String, Object> compilerOptions ) {
    this.compilerOptions = compilerOptions;
  }

  public String getCompilationLevel() {
    return compilationLevel;
  }

  public void setCompilationLevel( String compilationLevel ) {
    this.compilationLevel = compilationLevel;
  }

  public String getLoggingLevel() {
    return loggingLevel;
  }

  public void setLoggingLevel( String loggingLevel ) {
    this.loggingLevel = loggingLevel;
  }
}
