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

package com.google.api.services.sheets.v4.model;

/**
 * A reply to a developer metadata search request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SearchDeveloperMetadataResponse extends com.google.api.client.json.GenericJson {

  /**
   * The metadata matching the criteria of the search request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MatchedDeveloperMetadata> matchedDeveloperMetadata;

  static {
    // hack to force ProGuard to consider MatchedDeveloperMetadata used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(MatchedDeveloperMetadata.class);
  }

  /**
   * The metadata matching the criteria of the search request.
   * @return value or {@code null} for none
   */
  public java.util.List<MatchedDeveloperMetadata> getMatchedDeveloperMetadata() {
    return matchedDeveloperMetadata;
  }

  /**
   * The metadata matching the criteria of the search request.
   * @param matchedDeveloperMetadata matchedDeveloperMetadata or {@code null} for none
   */
  public SearchDeveloperMetadataResponse setMatchedDeveloperMetadata(java.util.List<MatchedDeveloperMetadata> matchedDeveloperMetadata) {
    this.matchedDeveloperMetadata = matchedDeveloperMetadata;
    return this;
  }

  @Override
  public SearchDeveloperMetadataResponse set(String fieldName, Object value) {
    return (SearchDeveloperMetadataResponse) super.set(fieldName, value);
  }

  @Override
  public SearchDeveloperMetadataResponse clone() {
    return (SearchDeveloperMetadataResponse) super.clone();
  }

}
