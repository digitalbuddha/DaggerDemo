/*
 * Copyright (C) 2013 Square, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.digitalbuddha.daggerdemo;

import android.app.Application;

import com.digitalbuddha.daggerdemo.dagger.AndroidModule;
import com.digitalbuddha.daggerdemo.utils.CustomVolley;

import java.util.Arrays;
import java.util.List;

import dagger.ObjectGraph;

public class DemoApplication extends Application {
  private ObjectGraph applicationGraph;

  @Override public void onCreate() {
    super.onCreate();

    applicationGraph = ObjectGraph.create(getModules().toArray());
      CustomVolley.getInstance().init(this);
  }

  /**
   * A list of modules to use for the application graph. Subclasses can override this method to
   * provide additional modules provided they call {@code super.getModules()}.
   */
  protected List<Object> getModules() {
    return Arrays.<Object>asList(new AndroidModule(this));
  }

  public ObjectGraph getApplicationGraph() {
    return applicationGraph;
  }
}
