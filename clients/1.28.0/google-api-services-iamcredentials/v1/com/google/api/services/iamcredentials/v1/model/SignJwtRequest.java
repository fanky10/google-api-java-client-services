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

package com.google.api.services.iamcredentials.v1.model;

/**
 * Model definition for SignJwtRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the IAM Service Account Credentials API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SignJwtRequest extends com.google.api.client.json.GenericJson {

  /**
   * The sequence of service accounts in a delegation chain. Each service account must be granted
   * the `roles/iam.serviceAccountTokenCreator` role on its next service account in the chain. The
   * last service account in the chain must be granted the `roles/iam.serviceAccountTokenCreator`
   * role on the service account that is specified in the `name` field of the request.
   *
   * The delegates must have the following format:
   * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> delegates;

  /**
   * The JWT payload to sign: a JSON object that contains a JWT Claims Set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String payload;

  /**
   * The sequence of service accounts in a delegation chain. Each service account must be granted
   * the `roles/iam.serviceAccountTokenCreator` role on its next service account in the chain. The
   * last service account in the chain must be granted the `roles/iam.serviceAccountTokenCreator`
   * role on the service account that is specified in the `name` field of the request.
   *
   * The delegates must have the following format:
   * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDelegates() {
    return delegates;
  }

  /**
   * The sequence of service accounts in a delegation chain. Each service account must be granted
   * the `roles/iam.serviceAccountTokenCreator` role on its next service account in the chain. The
   * last service account in the chain must be granted the `roles/iam.serviceAccountTokenCreator`
   * role on the service account that is specified in the `name` field of the request.
   *
   * The delegates must have the following format:
   * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`
   * @param delegates delegates or {@code null} for none
   */
  public SignJwtRequest setDelegates(java.util.List<java.lang.String> delegates) {
    this.delegates = delegates;
    return this;
  }

  /**
   * The JWT payload to sign: a JSON object that contains a JWT Claims Set.
   * @return value or {@code null} for none
   */
  public java.lang.String getPayload() {
    return payload;
  }

  /**
   * The JWT payload to sign: a JSON object that contains a JWT Claims Set.
   * @param payload payload or {@code null} for none
   */
  public SignJwtRequest setPayload(java.lang.String payload) {
    this.payload = payload;
    return this;
  }

  @Override
  public SignJwtRequest set(String fieldName, Object value) {
    return (SignJwtRequest) super.set(fieldName, value);
  }

  @Override
  public SignJwtRequest clone() {
    return (SignJwtRequest) super.clone();
  }

}
