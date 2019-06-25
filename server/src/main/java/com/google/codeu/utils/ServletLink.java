/*
 * Copyright 2019 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.codeu.utils;

/** Constants for all servlet links. */
public final class ServletLink {

  /** Private Constructor. */
  private ServletLink() {}

  /** Url prefix for all servlet links. */
  public static final String SERVLET_PREFIX = "/api";

  /** Url handled by {@link LoginServlet}. */
  public static final String LOGIN = SERVLET_PREFIX + "/login";
  /** Url handled by {@link LoginStatusServlet}. */
  public static final String LOGIN_STATUS = SERVLET_PREFIX + "/login-status";

  /** Url handled by {@link LogoutServlet}. */
  public static final String LOGOUT = SERVLET_PREFIX + "/logout";

  /** Url handled by {@link MessageServlet}. */
  public static final String MESSAGES = SERVLET_PREFIX + "/messages";

  /** Index url handled by the client. */
  public static final String INDEX = "/";
  /** User page url handled by the client. */
  public static final String USER_PAGE = "/userpage";

  public static final String ABOUT_US = SERVLET_PREFIX + "/aboutus";

  /** Blobstore url handled by the client. */
  public static final String BLOBSTORE_UPLOAD = SERVLET_PREFIX + "/blobstore-upload-url";

  public static final String CHART = SERVLET_PREFIX + "/chart";

  public static final String MY_FORM_HANDLER = SERVLET_PREFIX + "/my-form-handler";

  public static final String HOME = SERVLET_PREFIX + "/home";

  public static final String MAP = SERVLET_PREFIX + "/map";

  public static final String FEED = SERVLET_PREFIX + "/feed";

  public static final String STATS = SERVLET_PREFIX + "/stats";

  public static final String USER_LIST = SERVLET_PREFIX + "/user-list";
}
