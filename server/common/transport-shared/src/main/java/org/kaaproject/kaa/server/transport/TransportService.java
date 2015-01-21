/*
 * Copyright 2014 CyberVision, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kaaproject.kaa.server.transport;

/**
 * Responsible for lookup, initialization and life-cycle management of available
 * transport implementations
 * 
 * @author Andrew Shvayka
 *
 */
public interface TransportService {

    /**
     * Lookup available transport implementations and initialize them
     */
    void lookupAndInit();

    /**
     * Start all initialized.
     */
    void start();

    /**
     * Stop all initialized.
     */
    void stop();

    /**
     * Adds listener to updates of the {@link Transport} states
     */
    boolean addListener(TransportUpdateListener listener);

    /**
     * Removes listener to updates of the {@link Transport} states
     */
    boolean removeListener(TransportUpdateListener listener);

}
