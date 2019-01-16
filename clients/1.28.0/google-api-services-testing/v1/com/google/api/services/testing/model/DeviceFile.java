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

package com.google.api.services.testing.model;

/**
 * A single device file description.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Testing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DeviceFile extends com.google.api.client.json.GenericJson {

  /**
   * A reference to an opaque binary blob file
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ObbFile obbFile;

  /**
   * A reference to a regular file
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RegularFile regularFile;

  /**
   * A reference to an opaque binary blob file
   * @return value or {@code null} for none
   */
  public ObbFile getObbFile() {
    return obbFile;
  }

  /**
   * A reference to an opaque binary blob file
   * @param obbFile obbFile or {@code null} for none
   */
  public DeviceFile setObbFile(ObbFile obbFile) {
    this.obbFile = obbFile;
    return this;
  }

  /**
   * A reference to a regular file
   * @return value or {@code null} for none
   */
  public RegularFile getRegularFile() {
    return regularFile;
  }

  /**
   * A reference to a regular file
   * @param regularFile regularFile or {@code null} for none
   */
  public DeviceFile setRegularFile(RegularFile regularFile) {
    this.regularFile = regularFile;
    return this;
  }

  @Override
  public DeviceFile set(String fieldName, Object value) {
    return (DeviceFile) super.set(fieldName, value);
  }

  @Override
  public DeviceFile clone() {
    return (DeviceFile) super.clone();
  }

}
