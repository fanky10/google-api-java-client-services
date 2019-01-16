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

package com.google.api.services.content.model;

/**
 * Model definition for OrderShipmentLineItemShipment.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OrderShipmentLineItemShipment extends com.google.api.client.json.GenericJson {

  /**
   * The id of the line item that is shipped. Either lineItemId or productId is required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lineItemId;

  /**
   * The ID of the product to ship. This is the REST ID used in the products service. Either
   * lineItemId or productId is required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productId;

  /**
   * The quantity that is shipped.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long quantity;

  /**
   * The id of the line item that is shipped. Either lineItemId or productId is required.
   * @return value or {@code null} for none
   */
  public java.lang.String getLineItemId() {
    return lineItemId;
  }

  /**
   * The id of the line item that is shipped. Either lineItemId or productId is required.
   * @param lineItemId lineItemId or {@code null} for none
   */
  public OrderShipmentLineItemShipment setLineItemId(java.lang.String lineItemId) {
    this.lineItemId = lineItemId;
    return this;
  }

  /**
   * The ID of the product to ship. This is the REST ID used in the products service. Either
   * lineItemId or productId is required.
   * @return value or {@code null} for none
   */
  public java.lang.String getProductId() {
    return productId;
  }

  /**
   * The ID of the product to ship. This is the REST ID used in the products service. Either
   * lineItemId or productId is required.
   * @param productId productId or {@code null} for none
   */
  public OrderShipmentLineItemShipment setProductId(java.lang.String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * The quantity that is shipped.
   * @return value or {@code null} for none
   */
  public java.lang.Long getQuantity() {
    return quantity;
  }

  /**
   * The quantity that is shipped.
   * @param quantity quantity or {@code null} for none
   */
  public OrderShipmentLineItemShipment setQuantity(java.lang.Long quantity) {
    this.quantity = quantity;
    return this;
  }

  @Override
  public OrderShipmentLineItemShipment set(String fieldName, Object value) {
    return (OrderShipmentLineItemShipment) super.set(fieldName, value);
  }

  @Override
  public OrderShipmentLineItemShipment clone() {
    return (OrderShipmentLineItemShipment) super.clone();
  }

}
