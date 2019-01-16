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

package com.google.api.services.datastore.v1.model;

/**
 * A [GQL query](https://cloud.google.com/datastore/docs/apis/gql/gql_reference).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Datastore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GqlQuery extends com.google.api.client.json.GenericJson {

  /**
   * When false, the query string must not contain any literals and instead must bind all values.
   * For example, `SELECT * FROM Kind WHERE a = 'string literal'` is not allowed, while `SELECT *
   * FROM Kind WHERE a = @value` is.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean allowLiterals;

  /**
   * For each non-reserved named binding site in the query string, there must be a named parameter
   * with that name, but not necessarily the inverse.
   *
   * Key must match regex `A-Za-z_$*`, must not match regex `__.*__`, and must not be `""`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, GqlQueryParameter> namedBindings;

  /**
   * Numbered binding site @1 references the first numbered parameter, effectively using 1-based
   * indexing, rather than the usual 0.
   *
   * For each binding site numbered i in `query_string`, there must be an i-th numbered parameter.
   * The inverse must also be true.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GqlQueryParameter> positionalBindings;

  /**
   * A string of the format described
   * [here](https://cloud.google.com/datastore/docs/apis/gql/gql_reference).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String queryString;

  /**
   * When false, the query string must not contain any literals and instead must bind all values.
   * For example, `SELECT * FROM Kind WHERE a = 'string literal'` is not allowed, while `SELECT *
   * FROM Kind WHERE a = @value` is.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAllowLiterals() {
    return allowLiterals;
  }

  /**
   * When false, the query string must not contain any literals and instead must bind all values.
   * For example, `SELECT * FROM Kind WHERE a = 'string literal'` is not allowed, while `SELECT *
   * FROM Kind WHERE a = @value` is.
   * @param allowLiterals allowLiterals or {@code null} for none
   */
  public GqlQuery setAllowLiterals(java.lang.Boolean allowLiterals) {
    this.allowLiterals = allowLiterals;
    return this;
  }

  /**
   * For each non-reserved named binding site in the query string, there must be a named parameter
   * with that name, but not necessarily the inverse.
   *
   * Key must match regex `A-Za-z_$*`, must not match regex `__.*__`, and must not be `""`.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, GqlQueryParameter> getNamedBindings() {
    return namedBindings;
  }

  /**
   * For each non-reserved named binding site in the query string, there must be a named parameter
   * with that name, but not necessarily the inverse.
   *
   * Key must match regex `A-Za-z_$*`, must not match regex `__.*__`, and must not be `""`.
   * @param namedBindings namedBindings or {@code null} for none
   */
  public GqlQuery setNamedBindings(java.util.Map<String, GqlQueryParameter> namedBindings) {
    this.namedBindings = namedBindings;
    return this;
  }

  /**
   * Numbered binding site @1 references the first numbered parameter, effectively using 1-based
   * indexing, rather than the usual 0.
   *
   * For each binding site numbered i in `query_string`, there must be an i-th numbered parameter.
   * The inverse must also be true.
   * @return value or {@code null} for none
   */
  public java.util.List<GqlQueryParameter> getPositionalBindings() {
    return positionalBindings;
  }

  /**
   * Numbered binding site @1 references the first numbered parameter, effectively using 1-based
   * indexing, rather than the usual 0.
   *
   * For each binding site numbered i in `query_string`, there must be an i-th numbered parameter.
   * The inverse must also be true.
   * @param positionalBindings positionalBindings or {@code null} for none
   */
  public GqlQuery setPositionalBindings(java.util.List<GqlQueryParameter> positionalBindings) {
    this.positionalBindings = positionalBindings;
    return this;
  }

  /**
   * A string of the format described
   * [here](https://cloud.google.com/datastore/docs/apis/gql/gql_reference).
   * @return value or {@code null} for none
   */
  public java.lang.String getQueryString() {
    return queryString;
  }

  /**
   * A string of the format described
   * [here](https://cloud.google.com/datastore/docs/apis/gql/gql_reference).
   * @param queryString queryString or {@code null} for none
   */
  public GqlQuery setQueryString(java.lang.String queryString) {
    this.queryString = queryString;
    return this;
  }

  @Override
  public GqlQuery set(String fieldName, Object value) {
    return (GqlQuery) super.set(fieldName, value);
  }

  @Override
  public GqlQuery clone() {
    return (GqlQuery) super.clone();
  }

}
