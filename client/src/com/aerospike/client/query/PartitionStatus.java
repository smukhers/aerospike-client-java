/*
 * Copyright 2012-2022 Aerospike, Inc.
 *
 * Portions may be licensed to Aerospike, Inc. under one or more contributor
 * license agreements WHICH ARE COMPATIBLE WITH THE APACHE LICENSE, VERSION 2.0.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.aerospike.client.query;

import java.io.Serializable;

import com.aerospike.client.cluster.Node;

public final class PartitionStatus implements Serializable {
	private static final long serialVersionUID = 3L;

	public long bval;
	public byte[] digest;
	public final int id;
	public transient Node node;
	public transient int replicaIndex;
	public transient boolean unavailable;
	public boolean retry;

	public PartitionStatus(int id) {
		this.id = id;
		this.retry = true;
	}
}
