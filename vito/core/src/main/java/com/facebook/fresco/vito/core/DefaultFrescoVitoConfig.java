/*
 * Copyright (c) Facebook, Inc. and its affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.facebook.fresco.vito.core;

public class DefaultFrescoVitoConfig implements FrescoVitoConfig {
  @Override
  public boolean prefetchInOnPrepare() {
    return true;
  }

  @Override
  public PrefetchTarget prefetchTargetOnPrepare() {
    return PrefetchTarget.MEMORY_DECODED;
  }

  @Override
  public boolean submitFetchOnBgThread() {
    return true;
  }
}
