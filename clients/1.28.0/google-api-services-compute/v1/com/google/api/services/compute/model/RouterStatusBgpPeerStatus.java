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

package com.google.api.services.compute.model;

/**
 * Model definition for RouterStatusBgpPeerStatus.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RouterStatusBgpPeerStatus extends com.google.api.client.json.GenericJson {

  /**
   * Routes that were advertised to the remote BGP peer
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Route> advertisedRoutes;

  static {
    // hack to force ProGuard to consider Route used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Route.class);
  }

  /**
   * IP address of the local BGP interface.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ipAddress;

  /**
   * URL of the VPN tunnel that this BGP peer controls.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String linkedVpnTunnel;

  /**
   * Name of this BGP peer. Unique within the Routers resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Number of routes learned from the remote BGP Peer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long numLearnedRoutes;

  /**
   * IP address of the remote BGP interface.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String peerIpAddress;

  /**
   * BGP state as specified in RFC1771.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Status of the BGP peer: {UP, DOWN}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * Time this session has been up. Format: 14 years, 51 weeks, 6 days, 23 hours, 59 minutes, 59
   * seconds
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uptime;

  /**
   * Time this session has been up, in seconds. Format: 145
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uptimeSeconds;

  /**
   * Routes that were advertised to the remote BGP peer
   * @return value or {@code null} for none
   */
  public java.util.List<Route> getAdvertisedRoutes() {
    return advertisedRoutes;
  }

  /**
   * Routes that were advertised to the remote BGP peer
   * @param advertisedRoutes advertisedRoutes or {@code null} for none
   */
  public RouterStatusBgpPeerStatus setAdvertisedRoutes(java.util.List<Route> advertisedRoutes) {
    this.advertisedRoutes = advertisedRoutes;
    return this;
  }

  /**
   * IP address of the local BGP interface.
   * @return value or {@code null} for none
   */
  public java.lang.String getIpAddress() {
    return ipAddress;
  }

  /**
   * IP address of the local BGP interface.
   * @param ipAddress ipAddress or {@code null} for none
   */
  public RouterStatusBgpPeerStatus setIpAddress(java.lang.String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * URL of the VPN tunnel that this BGP peer controls.
   * @return value or {@code null} for none
   */
  public java.lang.String getLinkedVpnTunnel() {
    return linkedVpnTunnel;
  }

  /**
   * URL of the VPN tunnel that this BGP peer controls.
   * @param linkedVpnTunnel linkedVpnTunnel or {@code null} for none
   */
  public RouterStatusBgpPeerStatus setLinkedVpnTunnel(java.lang.String linkedVpnTunnel) {
    this.linkedVpnTunnel = linkedVpnTunnel;
    return this;
  }

  /**
   * Name of this BGP peer. Unique within the Routers resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of this BGP peer. Unique within the Routers resource.
   * @param name name or {@code null} for none
   */
  public RouterStatusBgpPeerStatus setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Number of routes learned from the remote BGP Peer.
   * @return value or {@code null} for none
   */
  public java.lang.Long getNumLearnedRoutes() {
    return numLearnedRoutes;
  }

  /**
   * Number of routes learned from the remote BGP Peer.
   * @param numLearnedRoutes numLearnedRoutes or {@code null} for none
   */
  public RouterStatusBgpPeerStatus setNumLearnedRoutes(java.lang.Long numLearnedRoutes) {
    this.numLearnedRoutes = numLearnedRoutes;
    return this;
  }

  /**
   * IP address of the remote BGP interface.
   * @return value or {@code null} for none
   */
  public java.lang.String getPeerIpAddress() {
    return peerIpAddress;
  }

  /**
   * IP address of the remote BGP interface.
   * @param peerIpAddress peerIpAddress or {@code null} for none
   */
  public RouterStatusBgpPeerStatus setPeerIpAddress(java.lang.String peerIpAddress) {
    this.peerIpAddress = peerIpAddress;
    return this;
  }

  /**
   * BGP state as specified in RFC1771.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * BGP state as specified in RFC1771.
   * @param state state or {@code null} for none
   */
  public RouterStatusBgpPeerStatus setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Status of the BGP peer: {UP, DOWN}
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * Status of the BGP peer: {UP, DOWN}
   * @param status status or {@code null} for none
   */
  public RouterStatusBgpPeerStatus setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * Time this session has been up. Format: 14 years, 51 weeks, 6 days, 23 hours, 59 minutes, 59
   * seconds
   * @return value or {@code null} for none
   */
  public java.lang.String getUptime() {
    return uptime;
  }

  /**
   * Time this session has been up. Format: 14 years, 51 weeks, 6 days, 23 hours, 59 minutes, 59
   * seconds
   * @param uptime uptime or {@code null} for none
   */
  public RouterStatusBgpPeerStatus setUptime(java.lang.String uptime) {
    this.uptime = uptime;
    return this;
  }

  /**
   * Time this session has been up, in seconds. Format: 145
   * @return value or {@code null} for none
   */
  public java.lang.String getUptimeSeconds() {
    return uptimeSeconds;
  }

  /**
   * Time this session has been up, in seconds. Format: 145
   * @param uptimeSeconds uptimeSeconds or {@code null} for none
   */
  public RouterStatusBgpPeerStatus setUptimeSeconds(java.lang.String uptimeSeconds) {
    this.uptimeSeconds = uptimeSeconds;
    return this;
  }

  @Override
  public RouterStatusBgpPeerStatus set(String fieldName, Object value) {
    return (RouterStatusBgpPeerStatus) super.set(fieldName, value);
  }

  @Override
  public RouterStatusBgpPeerStatus clone() {
    return (RouterStatusBgpPeerStatus) super.clone();
  }

}
