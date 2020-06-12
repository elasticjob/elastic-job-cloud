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

package io.elasticjob.cloud.event;

import com.google.common.eventbus.AllowConcurrentEvents;
import com.google.common.eventbus.Subscribe;
import io.elasticjob.cloud.event.type.JobExecutionEvent;
import io.elasticjob.cloud.event.type.JobStatusTraceEvent;

/**
 * 作业事件监听器.
 *
 * @author zhangliang
 */
public interface JobEventListener extends JobEventIdentity {
    
    /**
     * 作业执行事件监听执行.
     *
     * @param jobExecutionEvent 作业执行事件
     */
    @Subscribe
    @AllowConcurrentEvents
    void listen(JobExecutionEvent jobExecutionEvent);
    
    /**
     * 作业状态痕迹事件监听执行.
     *
     * @param jobStatusTraceEvent 作业状态痕迹事件
     */
    @Subscribe
    @AllowConcurrentEvents
    void listen(JobStatusTraceEvent jobStatusTraceEvent);
}
