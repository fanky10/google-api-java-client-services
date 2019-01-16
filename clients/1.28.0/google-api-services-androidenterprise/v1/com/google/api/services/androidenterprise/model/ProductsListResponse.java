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

package com.google.api.services.androidenterprise.model;

/**
 * The matching products.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play EMM API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ProductsListResponse extends com.google.api.client.json.GenericJson {

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "androidenterprise#productsListResponse".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * General pagination information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PageInfo pageInfo;

  /**
   * Information about a product (e.g. an app) in the Google Play store, for display to an
   * enterprise admin.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Product> product;

  static {
    // hack to force ProGuard to consider Product used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Product.class);
  }

  /**
   * Pagination information for token pagination.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TokenPagination tokenPagination;

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "androidenterprise#productsListResponse".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "androidenterprise#productsListResponse".
   * @param kind kind or {@code null} for none
   */
  public ProductsListResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * General pagination information.
   * @return value or {@code null} for none
   */
  public PageInfo getPageInfo() {
    return pageInfo;
  }

  /**
   * General pagination information.
   * @param pageInfo pageInfo or {@code null} for none
   */
  public ProductsListResponse setPageInfo(PageInfo pageInfo) {
    this.pageInfo = pageInfo;
    return this;
  }

  /**
   * Information about a product (e.g. an app) in the Google Play store, for display to an
   * enterprise admin.
   * @return value or {@code null} for none
   */
  public java.util.List<Product> getProduct() {
    return product;
  }

  /**
   * Information about a product (e.g. an app) in the Google Play store, for display to an
   * enterprise admin.
   * @param product product or {@code null} for none
   */
  public ProductsListResponse setProduct(java.util.List<Product> product) {
    this.product = product;
    return this;
  }

  /**
   * Pagination information for token pagination.
   * @return value or {@code null} for none
   */
  public TokenPagination getTokenPagination() {
    return tokenPagination;
  }

  /**
   * Pagination information for token pagination.
   * @param tokenPagination tokenPagination or {@code null} for none
   */
  public ProductsListResponse setTokenPagination(TokenPagination tokenPagination) {
    this.tokenPagination = tokenPagination;
    return this;
  }

  @Override
  public ProductsListResponse set(String fieldName, Object value) {
    return (ProductsListResponse) super.set(fieldName, value);
  }

  @Override
  public ProductsListResponse clone() {
    return (ProductsListResponse) super.clone();
  }

}
