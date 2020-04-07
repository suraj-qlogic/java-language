/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/language/v1beta2/language_service.proto

package com.google.cloud.language.v1beta2;

public interface DocumentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.language.v1beta2.Document)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. If the type is not set or is `TYPE_UNSPECIFIED`,
   * returns an `INVALID_ARGUMENT` error.
   * </pre>
   *
   * <code>.google.cloud.language.v1beta2.Document.Type type = 1;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * Required. If the type is not set or is `TYPE_UNSPECIFIED`,
   * returns an `INVALID_ARGUMENT` error.
   * </pre>
   *
   * <code>.google.cloud.language.v1beta2.Document.Type type = 1;</code>
   *
   * @return The type.
   */
  com.google.cloud.language.v1beta2.Document.Type getType();

  /**
   *
   *
   * <pre>
   * The content of the input in string format.
   * Cloud audit logging exempt since it is based on user data.
   * </pre>
   *
   * <code>string content = 2;</code>
   *
   * @return The content.
   */
  java.lang.String getContent();
  /**
   *
   *
   * <pre>
   * The content of the input in string format.
   * Cloud audit logging exempt since it is based on user data.
   * </pre>
   *
   * <code>string content = 2;</code>
   *
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString getContentBytes();

  /**
   *
   *
   * <pre>
   * The Google Cloud Storage URI where the file content is located.
   * This URI must be of the form: gs://bucket_name/object_name. For more
   * details, see https://cloud.google.com/storage/docs/reference-uris.
   * NOTE: Cloud Storage object versioning is not supported.
   * </pre>
   *
   * <code>string gcs_content_uri = 3;</code>
   *
   * @return The gcsContentUri.
   */
  java.lang.String getGcsContentUri();
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage URI where the file content is located.
   * This URI must be of the form: gs://bucket_name/object_name. For more
   * details, see https://cloud.google.com/storage/docs/reference-uris.
   * NOTE: Cloud Storage object versioning is not supported.
   * </pre>
   *
   * <code>string gcs_content_uri = 3;</code>
   *
   * @return The bytes for gcsContentUri.
   */
  com.google.protobuf.ByteString getGcsContentUriBytes();

  /**
   *
   *
   * <pre>
   * The language of the document (if not specified, the language is
   * automatically detected). Both ISO and BCP-47 language codes are
   * accepted.&lt;br&gt;
   * [Language
   * Support](https://cloud.google.com/natural-language/docs/languages) lists
   * currently supported languages for each API method. If the language (either
   * specified by the caller or automatically detected) is not supported by the
   * called API method, an `INVALID_ARGUMENT` error is returned.
   * </pre>
   *
   * <code>string language = 4;</code>
   *
   * @return The language.
   */
  java.lang.String getLanguage();
  /**
   *
   *
   * <pre>
   * The language of the document (if not specified, the language is
   * automatically detected). Both ISO and BCP-47 language codes are
   * accepted.&lt;br&gt;
   * [Language
   * Support](https://cloud.google.com/natural-language/docs/languages) lists
   * currently supported languages for each API method. If the language (either
   * specified by the caller or automatically detected) is not supported by the
   * called API method, an `INVALID_ARGUMENT` error is returned.
   * </pre>
   *
   * <code>string language = 4;</code>
   *
   * @return The bytes for language.
   */
  com.google.protobuf.ByteString getLanguageBytes();

  public com.google.cloud.language.v1beta2.Document.SourceCase getSourceCase();
}
