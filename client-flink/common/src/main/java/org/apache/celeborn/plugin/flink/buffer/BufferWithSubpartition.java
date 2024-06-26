/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.celeborn.plugin.flink.buffer;

import static org.apache.flink.util.Preconditions.checkNotNull;

import org.apache.flink.runtime.io.network.buffer.Buffer;

/** Buffer and the corresponding subpartition index. */
public class BufferWithSubpartition {

  private final Buffer buffer;

  private final int subpartitionIndex;

  public BufferWithSubpartition(Buffer buffer, int subpartitionIndex) {
    this.buffer = checkNotNull(buffer);
    this.subpartitionIndex = subpartitionIndex;
  }

  public Buffer getBuffer() {
    return buffer;
  }

  public int getSubpartitionIndex() {
    return subpartitionIndex;
  }
}
