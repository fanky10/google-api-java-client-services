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

package com.google.api.services.cloudkms.v1.model;

/**
 * Response message for KeyManagementService.AsymmetricDecrypt.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Key Management Service (KMS) API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AsymmetricDecryptResponse extends com.google.api.client.json.GenericJson {

  /**
   * The decrypted data originally encrypted with the matching public key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String plaintext;

  /**
   * The decrypted data originally encrypted with the matching public key.
   * @see #decodePlaintext()
   * @return value or {@code null} for none
   */
  public java.lang.String getPlaintext() {
    return plaintext;
  }

  /**
   * The decrypted data originally encrypted with the matching public key.
   * @see #getPlaintext()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodePlaintext() {
    return com.google.api.client.util.Base64.decodeBase64(plaintext);
  }

  /**
   * The decrypted data originally encrypted with the matching public key.
   * @see #encodePlaintext()
   * @param plaintext plaintext or {@code null} for none
   */
  public AsymmetricDecryptResponse setPlaintext(java.lang.String plaintext) {
    this.plaintext = plaintext;
    return this;
  }

  /**
   * The decrypted data originally encrypted with the matching public key.
   * @see #setPlaintext()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public AsymmetricDecryptResponse encodePlaintext(byte[] plaintext) {
    this.plaintext = com.google.api.client.util.Base64.encodeBase64URLSafeString(plaintext);
    return this;
  }

  @Override
  public AsymmetricDecryptResponse set(String fieldName, Object value) {
    return (AsymmetricDecryptResponse) super.set(fieldName, value);
  }

  @Override
  public AsymmetricDecryptResponse clone() {
    return (AsymmetricDecryptResponse) super.clone();
  }

}
