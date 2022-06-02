
// Copyright 2019 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../chrome/browser/vr/text_edit_action.h

package org.chromium.chrome.browser.vr;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    TextEditActionType.CLEAR_COMPOSING_TEXT, TextEditActionType.COMMIT_TEXT,
    TextEditActionType.SET_COMPOSING_TEXT, TextEditActionType.DELETE_TEXT
})
@Retention(RetentionPolicy.SOURCE)
public @interface TextEditActionType {
  int CLEAR_COMPOSING_TEXT = 0;
  int COMMIT_TEXT = 1;
  int SET_COMPOSING_TEXT = 2;
  int DELETE_TEXT = 3;
}
