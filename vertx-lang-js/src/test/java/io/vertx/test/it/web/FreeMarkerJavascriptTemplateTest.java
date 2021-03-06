/*
 * Copyright 2016 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.vertx.test.it.web;

import io.vertx.lang.js.ClasspathFileResolver;
import io.vertx.test.lang.js.JSTestBase;
import org.junit.Test;

/**
 * @author Thomas Segismont
 */
public class FreeMarkerJavascriptTemplateTest extends JSTestBase {

  static {
    ClasspathFileResolver.init();
  }

  @Override
  protected String getTestFile() {
    return "it/web/freemarker_javascript_template_test.js";
  }

  @Test
  public void testTemplate() throws Exception {
    runTest();
  }
}
