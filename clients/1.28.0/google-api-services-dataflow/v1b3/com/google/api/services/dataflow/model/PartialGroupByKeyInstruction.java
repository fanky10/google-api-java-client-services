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

package com.google.api.services.dataflow.model;

/**
 * An instruction that does a partial group-by-key. One input and one output.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PartialGroupByKeyInstruction extends com.google.api.client.json.GenericJson {

  /**
   * Describes the input to the partial group-by-key instruction.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InstructionInput input;

  /**
   * The codec to use for interpreting an element in the input PTable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> inputElementCodec;

  /**
   * If this instruction includes a combining function this is the name of the intermediate store
   * between the GBK and the CombineValues.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String originalCombineValuesInputStoreName;

  /**
   * If this instruction includes a combining function, this is the name of the CombineValues
   * instruction lifted into this instruction.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String originalCombineValuesStepName;

  /**
   * Zero or more side inputs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SideInputInfo> sideInputs;

  /**
   * The value combining function to invoke.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> valueCombiningFn;

  /**
   * Describes the input to the partial group-by-key instruction.
   * @return value or {@code null} for none
   */
  public InstructionInput getInput() {
    return input;
  }

  /**
   * Describes the input to the partial group-by-key instruction.
   * @param input input or {@code null} for none
   */
  public PartialGroupByKeyInstruction setInput(InstructionInput input) {
    this.input = input;
    return this;
  }

  /**
   * The codec to use for interpreting an element in the input PTable.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getInputElementCodec() {
    return inputElementCodec;
  }

  /**
   * The codec to use for interpreting an element in the input PTable.
   * @param inputElementCodec inputElementCodec or {@code null} for none
   */
  public PartialGroupByKeyInstruction setInputElementCodec(java.util.Map<String, java.lang.Object> inputElementCodec) {
    this.inputElementCodec = inputElementCodec;
    return this;
  }

  /**
   * If this instruction includes a combining function this is the name of the intermediate store
   * between the GBK and the CombineValues.
   * @return value or {@code null} for none
   */
  public java.lang.String getOriginalCombineValuesInputStoreName() {
    return originalCombineValuesInputStoreName;
  }

  /**
   * If this instruction includes a combining function this is the name of the intermediate store
   * between the GBK and the CombineValues.
   * @param originalCombineValuesInputStoreName originalCombineValuesInputStoreName or {@code null} for none
   */
  public PartialGroupByKeyInstruction setOriginalCombineValuesInputStoreName(java.lang.String originalCombineValuesInputStoreName) {
    this.originalCombineValuesInputStoreName = originalCombineValuesInputStoreName;
    return this;
  }

  /**
   * If this instruction includes a combining function, this is the name of the CombineValues
   * instruction lifted into this instruction.
   * @return value or {@code null} for none
   */
  public java.lang.String getOriginalCombineValuesStepName() {
    return originalCombineValuesStepName;
  }

  /**
   * If this instruction includes a combining function, this is the name of the CombineValues
   * instruction lifted into this instruction.
   * @param originalCombineValuesStepName originalCombineValuesStepName or {@code null} for none
   */
  public PartialGroupByKeyInstruction setOriginalCombineValuesStepName(java.lang.String originalCombineValuesStepName) {
    this.originalCombineValuesStepName = originalCombineValuesStepName;
    return this;
  }

  /**
   * Zero or more side inputs.
   * @return value or {@code null} for none
   */
  public java.util.List<SideInputInfo> getSideInputs() {
    return sideInputs;
  }

  /**
   * Zero or more side inputs.
   * @param sideInputs sideInputs or {@code null} for none
   */
  public PartialGroupByKeyInstruction setSideInputs(java.util.List<SideInputInfo> sideInputs) {
    this.sideInputs = sideInputs;
    return this;
  }

  /**
   * The value combining function to invoke.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getValueCombiningFn() {
    return valueCombiningFn;
  }

  /**
   * The value combining function to invoke.
   * @param valueCombiningFn valueCombiningFn or {@code null} for none
   */
  public PartialGroupByKeyInstruction setValueCombiningFn(java.util.Map<String, java.lang.Object> valueCombiningFn) {
    this.valueCombiningFn = valueCombiningFn;
    return this;
  }

  @Override
  public PartialGroupByKeyInstruction set(String fieldName, Object value) {
    return (PartialGroupByKeyInstruction) super.set(fieldName, value);
  }

  @Override
  public PartialGroupByKeyInstruction clone() {
    return (PartialGroupByKeyInstruction) super.clone();
  }

}
