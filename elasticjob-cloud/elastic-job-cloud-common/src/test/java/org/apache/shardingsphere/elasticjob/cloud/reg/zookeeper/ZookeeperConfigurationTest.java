/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.elasticjob.cloud.reg.zookeeper;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public final class ZookeeperConfigurationTest {
    
    @Test
    public void assertNewZookeeperConfigurationForServerListsAndNamespace() {
        ZookeeperConfiguration zkConfig = new ZookeeperConfiguration("localhost:2181", "myNamespace");
        Assert.assertThat(zkConfig.getServerLists(), Is.is("localhost:2181"));
        Assert.assertThat(zkConfig.getNamespace(), Is.is("myNamespace"));
        Assert.assertThat(zkConfig.getBaseSleepTimeMilliseconds(), Is.is(1000));
        Assert.assertThat(zkConfig.getMaxSleepTimeMilliseconds(), Is.is(3000));
        Assert.assertThat(zkConfig.getMaxRetries(), Is.is(3));
    }
}
