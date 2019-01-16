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

package com.google.api.services.genomics.model;

/**
 * The variant data import request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Genomics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ImportVariantsRequest extends com.google.api.client.json.GenericJson {

  /**
   * The format of the variant data being imported. If unspecified, defaults to to `VCF`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String format;

  /**
   * A mapping between info field keys and the InfoMergeOperations to be performed on them. This is
   * plumbed down to the MergeVariantRequests generated by the resulting import job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> infoMergeConfig;

  /**
   * Convert reference names to the canonical representation. hg19 haploytypes (those reference
   * names containing "_hap") are not modified in any way. All other reference names are modified
   * according to the following rules: The reference name is capitalized. The "chr" prefix is
   * dropped for all autosomes and sex chromsomes. For example "chr17" becomes "17" and "chrX"
   * becomes "X". All mitochondrial chromosomes ("chrM", "chrMT", etc) become "MT".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean normalizeReferenceNames;

  /**
   * A list of URIs referencing variant files in Google Cloud Storage. URIs can include wildcards
   * [as described here](https://cloud.google.com/storage/docs/gsutil/addlhelp/WildcardNames). Note
   * that recursive wildcards ('**') are not supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> sourceUris;

  /**
   * Required. The variant set to which variant data should be imported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String variantSetId;

  /**
   * The format of the variant data being imported. If unspecified, defaults to to `VCF`.
   * @return value or {@code null} for none
   */
  public java.lang.String getFormat() {
    return format;
  }

  /**
   * The format of the variant data being imported. If unspecified, defaults to to `VCF`.
   * @param format format or {@code null} for none
   */
  public ImportVariantsRequest setFormat(java.lang.String format) {
    this.format = format;
    return this;
  }

  /**
   * A mapping between info field keys and the InfoMergeOperations to be performed on them. This is
   * plumbed down to the MergeVariantRequests generated by the resulting import job.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getInfoMergeConfig() {
    return infoMergeConfig;
  }

  /**
   * A mapping between info field keys and the InfoMergeOperations to be performed on them. This is
   * plumbed down to the MergeVariantRequests generated by the resulting import job.
   * @param infoMergeConfig infoMergeConfig or {@code null} for none
   */
  public ImportVariantsRequest setInfoMergeConfig(java.util.Map<String, java.lang.String> infoMergeConfig) {
    this.infoMergeConfig = infoMergeConfig;
    return this;
  }

  /**
   * Convert reference names to the canonical representation. hg19 haploytypes (those reference
   * names containing "_hap") are not modified in any way. All other reference names are modified
   * according to the following rules: The reference name is capitalized. The "chr" prefix is
   * dropped for all autosomes and sex chromsomes. For example "chr17" becomes "17" and "chrX"
   * becomes "X". All mitochondrial chromosomes ("chrM", "chrMT", etc) become "MT".
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getNormalizeReferenceNames() {
    return normalizeReferenceNames;
  }

  /**
   * Convert reference names to the canonical representation. hg19 haploytypes (those reference
   * names containing "_hap") are not modified in any way. All other reference names are modified
   * according to the following rules: The reference name is capitalized. The "chr" prefix is
   * dropped for all autosomes and sex chromsomes. For example "chr17" becomes "17" and "chrX"
   * becomes "X". All mitochondrial chromosomes ("chrM", "chrMT", etc) become "MT".
   * @param normalizeReferenceNames normalizeReferenceNames or {@code null} for none
   */
  public ImportVariantsRequest setNormalizeReferenceNames(java.lang.Boolean normalizeReferenceNames) {
    this.normalizeReferenceNames = normalizeReferenceNames;
    return this;
  }

  /**
   * A list of URIs referencing variant files in Google Cloud Storage. URIs can include wildcards
   * [as described here](https://cloud.google.com/storage/docs/gsutil/addlhelp/WildcardNames). Note
   * that recursive wildcards ('**') are not supported.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSourceUris() {
    return sourceUris;
  }

  /**
   * A list of URIs referencing variant files in Google Cloud Storage. URIs can include wildcards
   * [as described here](https://cloud.google.com/storage/docs/gsutil/addlhelp/WildcardNames). Note
   * that recursive wildcards ('**') are not supported.
   * @param sourceUris sourceUris or {@code null} for none
   */
  public ImportVariantsRequest setSourceUris(java.util.List<java.lang.String> sourceUris) {
    this.sourceUris = sourceUris;
    return this;
  }

  /**
   * Required. The variant set to which variant data should be imported.
   * @return value or {@code null} for none
   */
  public java.lang.String getVariantSetId() {
    return variantSetId;
  }

  /**
   * Required. The variant set to which variant data should be imported.
   * @param variantSetId variantSetId or {@code null} for none
   */
  public ImportVariantsRequest setVariantSetId(java.lang.String variantSetId) {
    this.variantSetId = variantSetId;
    return this;
  }

  @Override
  public ImportVariantsRequest set(String fieldName, Object value) {
    return (ImportVariantsRequest) super.set(fieldName, value);
  }

  @Override
  public ImportVariantsRequest clone() {
    return (ImportVariantsRequest) super.clone();
  }

}
