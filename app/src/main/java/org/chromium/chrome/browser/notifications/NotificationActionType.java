
// Copyright 2019 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../chrome/browser/notifications/notification_platform_bridge_android.cc

package org.chromium.chrome.browser.notifications;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    NotificationActionType.BUTTON, NotificationActionType.TEXT
})
@Retention(RetentionPolicy.SOURCE)
public @interface NotificationActionType {
  /**
   * NB. Making this a one-line enum breaks code generation! crbug.com/657847
   */
  int BUTTON = 0;
  int TEXT = 1;
}
