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

package com.google.api.services.classroom.model;

/**
 * Request to modify assignee mode and options of a coursework.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Classroom API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ModifyCourseWorkAssigneesRequest extends com.google.api.client.json.GenericJson {

  /**
   * Mode of the coursework describing whether it will be assigned to all students or specified
   * individual students.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String assigneeMode;

  /**
   * Set which students are assigned or not assigned to the coursework. Must be specified only when
   * `assigneeMode` is `INDIVIDUAL_STUDENTS`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ModifyIndividualStudentsOptions modifyIndividualStudentsOptions;

  /**
   * Mode of the coursework describing whether it will be assigned to all students or specified
   * individual students.
   * @return value or {@code null} for none
   */
  public java.lang.String getAssigneeMode() {
    return assigneeMode;
  }

  /**
   * Mode of the coursework describing whether it will be assigned to all students or specified
   * individual students.
   * @param assigneeMode assigneeMode or {@code null} for none
   */
  public ModifyCourseWorkAssigneesRequest setAssigneeMode(java.lang.String assigneeMode) {
    this.assigneeMode = assigneeMode;
    return this;
  }

  /**
   * Set which students are assigned or not assigned to the coursework. Must be specified only when
   * `assigneeMode` is `INDIVIDUAL_STUDENTS`.
   * @return value or {@code null} for none
   */
  public ModifyIndividualStudentsOptions getModifyIndividualStudentsOptions() {
    return modifyIndividualStudentsOptions;
  }

  /**
   * Set which students are assigned or not assigned to the coursework. Must be specified only when
   * `assigneeMode` is `INDIVIDUAL_STUDENTS`.
   * @param modifyIndividualStudentsOptions modifyIndividualStudentsOptions or {@code null} for none
   */
  public ModifyCourseWorkAssigneesRequest setModifyIndividualStudentsOptions(ModifyIndividualStudentsOptions modifyIndividualStudentsOptions) {
    this.modifyIndividualStudentsOptions = modifyIndividualStudentsOptions;
    return this;
  }

  @Override
  public ModifyCourseWorkAssigneesRequest set(String fieldName, Object value) {
    return (ModifyCourseWorkAssigneesRequest) super.set(fieldName, value);
  }

  @Override
  public ModifyCourseWorkAssigneesRequest clone() {
    return (ModifyCourseWorkAssigneesRequest) super.clone();
  }

}
