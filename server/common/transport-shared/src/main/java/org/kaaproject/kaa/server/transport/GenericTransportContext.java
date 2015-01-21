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
 * A context for transport initialization parameters with binary configuration.
 * 
 * @author Andrew Shvayka
 *
 */
public class GenericTransportContext extends TransportContext{

    private final byte[] configuration;
    
    public GenericTransportContext(TransportContext context, byte[] configuration) {
        super(context);
        this.configuration = configuration;
    }

    /**
     * Returns serialized configuration of this specific {@link Transport}.
     * @return serialized configuration
     */
    public byte[] getConfiguration() {
        return configuration;
    }

}
