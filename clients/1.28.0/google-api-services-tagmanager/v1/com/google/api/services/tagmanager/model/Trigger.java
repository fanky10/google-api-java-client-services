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

package com.google.api.services.tagmanager.model;

/**
 * Represents a Google Tag Manager Trigger
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Tag Manager API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Trigger extends com.google.api.client.json.GenericJson {

  /**
   * GTM Account ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String accountId;

  /**
   * Used in the case of auto event tracking.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Condition> autoEventFilter;

  static {
    // hack to force ProGuard to consider Condition used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Condition.class);
  }

  /**
   * Whether or not we should only fire tags if the form submit or link click event is not cancelled
   * by some other event handler (e.g. because of validation). Only valid for Form Submission and
   * Link Click triggers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Parameter checkValidation;

  /**
   * GTM Container ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String containerId;

  /**
   * A visibility trigger minimum continuous visible time (in milliseconds). Only valid for AMP
   * Visibility trigger.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Parameter continuousTimeMinMilliseconds;

  /**
   * Used in the case of custom event, which is fired iff all Conditions are true.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Condition> customEventFilter;

  static {
    // hack to force ProGuard to consider Condition used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Condition.class);
  }

  /**
   * Name of the GTM event that is fired. Only valid for Timer triggers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Parameter eventName;

  /**
   * The trigger will only fire iff all Conditions are true.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Condition> filter;

  static {
    // hack to force ProGuard to consider Condition used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Condition.class);
  }

  /**
   * The fingerprint of the GTM Trigger as computed at storage time. This value is recomputed
   * whenever the trigger is modified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fingerprint;

  /**
   * List of integer percentage values for scroll triggers. The trigger will fire when each
   * percentage is reached when the view is scrolled horizontally. Only valid for AMP scroll
   * triggers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Parameter horizontalScrollPercentageList;

  /**
   * Time between triggering recurring Timer Events (in milliseconds). Only valid for Timer
   * triggers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Parameter interval;

  /**
   * Time between Timer Events to fire (in seconds). Only valid for AMP Timer trigger.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Parameter intervalSeconds;

  /**
   * Limit of the number of GTM events this Timer Trigger will fire. If no limit is set, we will
   * continue to fire GTM events until the user leaves the page. Only valid for Timer triggers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Parameter limit;

  /**
   * Max time to fire Timer Events (in seconds). Only valid for AMP Timer trigger.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Parameter maxTimerLengthSeconds;

  /**
   * Trigger display name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Additional parameters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Parameter> parameter;

  static {
    // hack to force ProGuard to consider Parameter used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Parameter.class);
  }

  /**
   * Parent folder id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parentFolderId;

  /**
   * A click trigger CSS selector (i.e. "a", "button" etc.). Only valid for AMP Click trigger.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Parameter selector;

  /**
   * A visibility trigger minimum total visible time (in milliseconds). Only valid for AMP
   * Visibility trigger.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Parameter totalTimeMinMilliseconds;

  /**
   * The Trigger ID uniquely identifies the GTM Trigger.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String triggerId;

  /**
   * Defines the data layer event that causes this trigger.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Globally unique id of the trigger that auto-generates this (a Form Submit, Link Click or Timer
   * listener) if any. Used to make incompatible auto-events work together with trigger filtering
   * based on trigger ids. This value is populated during output generation since the tags implied
   * by triggers don't exist until then. Only valid for Form Submit, Link Click and Timer triggers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Parameter uniqueTriggerId;

  /**
   * List of integer percentage values for scroll triggers. The trigger will fire when each
   * percentage is reached when the view is scrolled vertically. Only valid for AMP scroll triggers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Parameter verticalScrollPercentageList;

  /**
   * A visibility trigger CSS selector (i.e. "#id"). Only valid for AMP Visibility trigger.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Parameter visibilitySelector;

  /**
   * A visibility trigger maximum percent visibility. Only valid for AMP Visibility trigger.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Parameter visiblePercentageMax;

  /**
   * A visibility trigger minimum percent visibility. Only valid for AMP Visibility trigger.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Parameter visiblePercentageMin;

  /**
   * Whether or not we should delay the form submissions or link opening until all of the tags have
   * fired (by preventing the default action and later simulating the default action). Only valid
   * for Form Submission and Link Click triggers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Parameter waitForTags;

  /**
   * How long to wait (in milliseconds) for tags to fire when 'waits_for_tags' above evaluates to
   * true. Only valid for Form Submission and Link Click triggers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Parameter waitForTagsTimeout;

  /**
   * GTM Account ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getAccountId() {
    return accountId;
  }

  /**
   * GTM Account ID.
   * @param accountId accountId or {@code null} for none
   */
  public Trigger setAccountId(java.lang.String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Used in the case of auto event tracking.
   * @return value or {@code null} for none
   */
  public java.util.List<Condition> getAutoEventFilter() {
    return autoEventFilter;
  }

  /**
   * Used in the case of auto event tracking.
   * @param autoEventFilter autoEventFilter or {@code null} for none
   */
  public Trigger setAutoEventFilter(java.util.List<Condition> autoEventFilter) {
    this.autoEventFilter = autoEventFilter;
    return this;
  }

  /**
   * Whether or not we should only fire tags if the form submit or link click event is not cancelled
   * by some other event handler (e.g. because of validation). Only valid for Form Submission and
   * Link Click triggers.
   * @return value or {@code null} for none
   */
  public Parameter getCheckValidation() {
    return checkValidation;
  }

  /**
   * Whether or not we should only fire tags if the form submit or link click event is not cancelled
   * by some other event handler (e.g. because of validation). Only valid for Form Submission and
   * Link Click triggers.
   * @param checkValidation checkValidation or {@code null} for none
   */
  public Trigger setCheckValidation(Parameter checkValidation) {
    this.checkValidation = checkValidation;
    return this;
  }

  /**
   * GTM Container ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getContainerId() {
    return containerId;
  }

  /**
   * GTM Container ID.
   * @param containerId containerId or {@code null} for none
   */
  public Trigger setContainerId(java.lang.String containerId) {
    this.containerId = containerId;
    return this;
  }

  /**
   * A visibility trigger minimum continuous visible time (in milliseconds). Only valid for AMP
   * Visibility trigger.
   * @return value or {@code null} for none
   */
  public Parameter getContinuousTimeMinMilliseconds() {
    return continuousTimeMinMilliseconds;
  }

  /**
   * A visibility trigger minimum continuous visible time (in milliseconds). Only valid for AMP
   * Visibility trigger.
   * @param continuousTimeMinMilliseconds continuousTimeMinMilliseconds or {@code null} for none
   */
  public Trigger setContinuousTimeMinMilliseconds(Parameter continuousTimeMinMilliseconds) {
    this.continuousTimeMinMilliseconds = continuousTimeMinMilliseconds;
    return this;
  }

  /**
   * Used in the case of custom event, which is fired iff all Conditions are true.
   * @return value or {@code null} for none
   */
  public java.util.List<Condition> getCustomEventFilter() {
    return customEventFilter;
  }

  /**
   * Used in the case of custom event, which is fired iff all Conditions are true.
   * @param customEventFilter customEventFilter or {@code null} for none
   */
  public Trigger setCustomEventFilter(java.util.List<Condition> customEventFilter) {
    this.customEventFilter = customEventFilter;
    return this;
  }

  /**
   * Name of the GTM event that is fired. Only valid for Timer triggers.
   * @return value or {@code null} for none
   */
  public Parameter getEventName() {
    return eventName;
  }

  /**
   * Name of the GTM event that is fired. Only valid for Timer triggers.
   * @param eventName eventName or {@code null} for none
   */
  public Trigger setEventName(Parameter eventName) {
    this.eventName = eventName;
    return this;
  }

  /**
   * The trigger will only fire iff all Conditions are true.
   * @return value or {@code null} for none
   */
  public java.util.List<Condition> getFilter() {
    return filter;
  }

  /**
   * The trigger will only fire iff all Conditions are true.
   * @param filter filter or {@code null} for none
   */
  public Trigger setFilter(java.util.List<Condition> filter) {
    this.filter = filter;
    return this;
  }

  /**
   * The fingerprint of the GTM Trigger as computed at storage time. This value is recomputed
   * whenever the trigger is modified.
   * @return value or {@code null} for none
   */
  public java.lang.String getFingerprint() {
    return fingerprint;
  }

  /**
   * The fingerprint of the GTM Trigger as computed at storage time. This value is recomputed
   * whenever the trigger is modified.
   * @param fingerprint fingerprint or {@code null} for none
   */
  public Trigger setFingerprint(java.lang.String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

  /**
   * List of integer percentage values for scroll triggers. The trigger will fire when each
   * percentage is reached when the view is scrolled horizontally. Only valid for AMP scroll
   * triggers.
   * @return value or {@code null} for none
   */
  public Parameter getHorizontalScrollPercentageList() {
    return horizontalScrollPercentageList;
  }

  /**
   * List of integer percentage values for scroll triggers. The trigger will fire when each
   * percentage is reached when the view is scrolled horizontally. Only valid for AMP scroll
   * triggers.
   * @param horizontalScrollPercentageList horizontalScrollPercentageList or {@code null} for none
   */
  public Trigger setHorizontalScrollPercentageList(Parameter horizontalScrollPercentageList) {
    this.horizontalScrollPercentageList = horizontalScrollPercentageList;
    return this;
  }

  /**
   * Time between triggering recurring Timer Events (in milliseconds). Only valid for Timer
   * triggers.
   * @return value or {@code null} for none
   */
  public Parameter getInterval() {
    return interval;
  }

  /**
   * Time between triggering recurring Timer Events (in milliseconds). Only valid for Timer
   * triggers.
   * @param interval interval or {@code null} for none
   */
  public Trigger setInterval(Parameter interval) {
    this.interval = interval;
    return this;
  }

  /**
   * Time between Timer Events to fire (in seconds). Only valid for AMP Timer trigger.
   * @return value or {@code null} for none
   */
  public Parameter getIntervalSeconds() {
    return intervalSeconds;
  }

  /**
   * Time between Timer Events to fire (in seconds). Only valid for AMP Timer trigger.
   * @param intervalSeconds intervalSeconds or {@code null} for none
   */
  public Trigger setIntervalSeconds(Parameter intervalSeconds) {
    this.intervalSeconds = intervalSeconds;
    return this;
  }

  /**
   * Limit of the number of GTM events this Timer Trigger will fire. If no limit is set, we will
   * continue to fire GTM events until the user leaves the page. Only valid for Timer triggers.
   * @return value or {@code null} for none
   */
  public Parameter getLimit() {
    return limit;
  }

  /**
   * Limit of the number of GTM events this Timer Trigger will fire. If no limit is set, we will
   * continue to fire GTM events until the user leaves the page. Only valid for Timer triggers.
   * @param limit limit or {@code null} for none
   */
  public Trigger setLimit(Parameter limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Max time to fire Timer Events (in seconds). Only valid for AMP Timer trigger.
   * @return value or {@code null} for none
   */
  public Parameter getMaxTimerLengthSeconds() {
    return maxTimerLengthSeconds;
  }

  /**
   * Max time to fire Timer Events (in seconds). Only valid for AMP Timer trigger.
   * @param maxTimerLengthSeconds maxTimerLengthSeconds or {@code null} for none
   */
  public Trigger setMaxTimerLengthSeconds(Parameter maxTimerLengthSeconds) {
    this.maxTimerLengthSeconds = maxTimerLengthSeconds;
    return this;
  }

  /**
   * Trigger display name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Trigger display name.
   * @param name name or {@code null} for none
   */
  public Trigger setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Additional parameters.
   * @return value or {@code null} for none
   */
  public java.util.List<Parameter> getParameter() {
    return parameter;
  }

  /**
   * Additional parameters.
   * @param parameter parameter or {@code null} for none
   */
  public Trigger setParameter(java.util.List<Parameter> parameter) {
    this.parameter = parameter;
    return this;
  }

  /**
   * Parent folder id.
   * @return value or {@code null} for none
   */
  public java.lang.String getParentFolderId() {
    return parentFolderId;
  }

  /**
   * Parent folder id.
   * @param parentFolderId parentFolderId or {@code null} for none
   */
  public Trigger setParentFolderId(java.lang.String parentFolderId) {
    this.parentFolderId = parentFolderId;
    return this;
  }

  /**
   * A click trigger CSS selector (i.e. "a", "button" etc.). Only valid for AMP Click trigger.
   * @return value or {@code null} for none
   */
  public Parameter getSelector() {
    return selector;
  }

  /**
   * A click trigger CSS selector (i.e. "a", "button" etc.). Only valid for AMP Click trigger.
   * @param selector selector or {@code null} for none
   */
  public Trigger setSelector(Parameter selector) {
    this.selector = selector;
    return this;
  }

  /**
   * A visibility trigger minimum total visible time (in milliseconds). Only valid for AMP
   * Visibility trigger.
   * @return value or {@code null} for none
   */
  public Parameter getTotalTimeMinMilliseconds() {
    return totalTimeMinMilliseconds;
  }

  /**
   * A visibility trigger minimum total visible time (in milliseconds). Only valid for AMP
   * Visibility trigger.
   * @param totalTimeMinMilliseconds totalTimeMinMilliseconds or {@code null} for none
   */
  public Trigger setTotalTimeMinMilliseconds(Parameter totalTimeMinMilliseconds) {
    this.totalTimeMinMilliseconds = totalTimeMinMilliseconds;
    return this;
  }

  /**
   * The Trigger ID uniquely identifies the GTM Trigger.
   * @return value or {@code null} for none
   */
  public java.lang.String getTriggerId() {
    return triggerId;
  }

  /**
   * The Trigger ID uniquely identifies the GTM Trigger.
   * @param triggerId triggerId or {@code null} for none
   */
  public Trigger setTriggerId(java.lang.String triggerId) {
    this.triggerId = triggerId;
    return this;
  }

  /**
   * Defines the data layer event that causes this trigger.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Defines the data layer event that causes this trigger.
   * @param type type or {@code null} for none
   */
  public Trigger setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * Globally unique id of the trigger that auto-generates this (a Form Submit, Link Click or Timer
   * listener) if any. Used to make incompatible auto-events work together with trigger filtering
   * based on trigger ids. This value is populated during output generation since the tags implied
   * by triggers don't exist until then. Only valid for Form Submit, Link Click and Timer triggers.
   * @return value or {@code null} for none
   */
  public Parameter getUniqueTriggerId() {
    return uniqueTriggerId;
  }

  /**
   * Globally unique id of the trigger that auto-generates this (a Form Submit, Link Click or Timer
   * listener) if any. Used to make incompatible auto-events work together with trigger filtering
   * based on trigger ids. This value is populated during output generation since the tags implied
   * by triggers don't exist until then. Only valid for Form Submit, Link Click and Timer triggers.
   * @param uniqueTriggerId uniqueTriggerId or {@code null} for none
   */
  public Trigger setUniqueTriggerId(Parameter uniqueTriggerId) {
    this.uniqueTriggerId = uniqueTriggerId;
    return this;
  }

  /**
   * List of integer percentage values for scroll triggers. The trigger will fire when each
   * percentage is reached when the view is scrolled vertically. Only valid for AMP scroll triggers.
   * @return value or {@code null} for none
   */
  public Parameter getVerticalScrollPercentageList() {
    return verticalScrollPercentageList;
  }

  /**
   * List of integer percentage values for scroll triggers. The trigger will fire when each
   * percentage is reached when the view is scrolled vertically. Only valid for AMP scroll triggers.
   * @param verticalScrollPercentageList verticalScrollPercentageList or {@code null} for none
   */
  public Trigger setVerticalScrollPercentageList(Parameter verticalScrollPercentageList) {
    this.verticalScrollPercentageList = verticalScrollPercentageList;
    return this;
  }

  /**
   * A visibility trigger CSS selector (i.e. "#id"). Only valid for AMP Visibility trigger.
   * @return value or {@code null} for none
   */
  public Parameter getVisibilitySelector() {
    return visibilitySelector;
  }

  /**
   * A visibility trigger CSS selector (i.e. "#id"). Only valid for AMP Visibility trigger.
   * @param visibilitySelector visibilitySelector or {@code null} for none
   */
  public Trigger setVisibilitySelector(Parameter visibilitySelector) {
    this.visibilitySelector = visibilitySelector;
    return this;
  }

  /**
   * A visibility trigger maximum percent visibility. Only valid for AMP Visibility trigger.
   * @return value or {@code null} for none
   */
  public Parameter getVisiblePercentageMax() {
    return visiblePercentageMax;
  }

  /**
   * A visibility trigger maximum percent visibility. Only valid for AMP Visibility trigger.
   * @param visiblePercentageMax visiblePercentageMax or {@code null} for none
   */
  public Trigger setVisiblePercentageMax(Parameter visiblePercentageMax) {
    this.visiblePercentageMax = visiblePercentageMax;
    return this;
  }

  /**
   * A visibility trigger minimum percent visibility. Only valid for AMP Visibility trigger.
   * @return value or {@code null} for none
   */
  public Parameter getVisiblePercentageMin() {
    return visiblePercentageMin;
  }

  /**
   * A visibility trigger minimum percent visibility. Only valid for AMP Visibility trigger.
   * @param visiblePercentageMin visiblePercentageMin or {@code null} for none
   */
  public Trigger setVisiblePercentageMin(Parameter visiblePercentageMin) {
    this.visiblePercentageMin = visiblePercentageMin;
    return this;
  }

  /**
   * Whether or not we should delay the form submissions or link opening until all of the tags have
   * fired (by preventing the default action and later simulating the default action). Only valid
   * for Form Submission and Link Click triggers.
   * @return value or {@code null} for none
   */
  public Parameter getWaitForTags() {
    return waitForTags;
  }

  /**
   * Whether or not we should delay the form submissions or link opening until all of the tags have
   * fired (by preventing the default action and later simulating the default action). Only valid
   * for Form Submission and Link Click triggers.
   * @param waitForTags waitForTags or {@code null} for none
   */
  public Trigger setWaitForTags(Parameter waitForTags) {
    this.waitForTags = waitForTags;
    return this;
  }

  /**
   * How long to wait (in milliseconds) for tags to fire when 'waits_for_tags' above evaluates to
   * true. Only valid for Form Submission and Link Click triggers.
   * @return value or {@code null} for none
   */
  public Parameter getWaitForTagsTimeout() {
    return waitForTagsTimeout;
  }

  /**
   * How long to wait (in milliseconds) for tags to fire when 'waits_for_tags' above evaluates to
   * true. Only valid for Form Submission and Link Click triggers.
   * @param waitForTagsTimeout waitForTagsTimeout or {@code null} for none
   */
  public Trigger setWaitForTagsTimeout(Parameter waitForTagsTimeout) {
    this.waitForTagsTimeout = waitForTagsTimeout;
    return this;
  }

  @Override
  public Trigger set(String fieldName, Object value) {
    return (Trigger) super.set(fieldName, value);
  }

  @Override
  public Trigger clone() {
    return (Trigger) super.clone();
  }

}
