/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.servicemanagement.model;

/**
 * Change report associated with a particular service configuration.
 *
 * It contains a list of ConfigChanges based on the comparison between two service configurations.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ChangeReport extends com.google.api.client.json.GenericJson {

  /**
   * List of changes between two service configurations. The changes will be alphabetically sorted
   * based on the identifier of each change. A ConfigChange identifier is a dot separated path to
   * the configuration. Example: visibility.rules[selector='LibraryService.CreateBook'].restriction
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ConfigChange> configChanges;

  /**
   * List of changes between two service configurations. The changes will be alphabetically sorted
   * based on the identifier of each change. A ConfigChange identifier is a dot separated path to
   * the configuration. Example: visibility.rules[selector='LibraryService.CreateBook'].restriction
   * @return value or {@code null} for none
   */
  public java.util.List<ConfigChange> getConfigChanges() {
    return configChanges;
  }

  /**
   * List of changes between two service configurations. The changes will be alphabetically sorted
   * based on the identifier of each change. A ConfigChange identifier is a dot separated path to
   * the configuration. Example: visibility.rules[selector='LibraryService.CreateBook'].restriction
   * @param configChanges configChanges or {@code null} for none
   */
  public ChangeReport setConfigChanges(java.util.List<ConfigChange> configChanges) {
    this.configChanges = configChanges;
    return this;
  }

  @Override
  public ChangeReport set(String fieldName, Object value) {
    return (ChangeReport) super.set(fieldName, value);
  }

  @Override
  public ChangeReport clone() {
    return (ChangeReport) super.clone();
  }

}
