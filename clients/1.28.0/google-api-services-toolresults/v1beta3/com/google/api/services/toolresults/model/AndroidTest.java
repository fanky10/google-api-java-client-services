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

package com.google.api.services.toolresults.model;

/**
 * An Android mobile test specification.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Tool Results API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AndroidTest extends com.google.api.client.json.GenericJson {

  /**
   * Information about the application under test.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AndroidAppInfo androidAppInfo;

  /**
   * An Android instrumentation test.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AndroidInstrumentationTest androidInstrumentationTest;

  /**
   * An Android robo test.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AndroidRoboTest androidRoboTest;

  /**
   * Max time a test is allowed to run before it is automatically cancelled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Duration testTimeout;

  /**
   * Information about the application under test.
   * @return value or {@code null} for none
   */
  public AndroidAppInfo getAndroidAppInfo() {
    return androidAppInfo;
  }

  /**
   * Information about the application under test.
   * @param androidAppInfo androidAppInfo or {@code null} for none
   */
  public AndroidTest setAndroidAppInfo(AndroidAppInfo androidAppInfo) {
    this.androidAppInfo = androidAppInfo;
    return this;
  }

  /**
   * An Android instrumentation test.
   * @return value or {@code null} for none
   */
  public AndroidInstrumentationTest getAndroidInstrumentationTest() {
    return androidInstrumentationTest;
  }

  /**
   * An Android instrumentation test.
   * @param androidInstrumentationTest androidInstrumentationTest or {@code null} for none
   */
  public AndroidTest setAndroidInstrumentationTest(AndroidInstrumentationTest androidInstrumentationTest) {
    this.androidInstrumentationTest = androidInstrumentationTest;
    return this;
  }

  /**
   * An Android robo test.
   * @return value or {@code null} for none
   */
  public AndroidRoboTest getAndroidRoboTest() {
    return androidRoboTest;
  }

  /**
   * An Android robo test.
   * @param androidRoboTest androidRoboTest or {@code null} for none
   */
  public AndroidTest setAndroidRoboTest(AndroidRoboTest androidRoboTest) {
    this.androidRoboTest = androidRoboTest;
    return this;
  }

  /**
   * Max time a test is allowed to run before it is automatically cancelled.
   * @return value or {@code null} for none
   */
  public Duration getTestTimeout() {
    return testTimeout;
  }

  /**
   * Max time a test is allowed to run before it is automatically cancelled.
   * @param testTimeout testTimeout or {@code null} for none
   */
  public AndroidTest setTestTimeout(Duration testTimeout) {
    this.testTimeout = testTimeout;
    return this;
  }

  @Override
  public AndroidTest set(String fieldName, Object value) {
    return (AndroidTest) super.set(fieldName, value);
  }

  @Override
  public AndroidTest clone() {
    return (AndroidTest) super.clone();
  }

}
