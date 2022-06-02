
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/frame/find_in_page.mojom
//

package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;


class FindInPageClient_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<FindInPageClient, FindInPageClient.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<FindInPageClient, FindInPageClient.Proxy>() {

        @Override
        public String getName() {
            return "blink.mojom.FindInPageClient";
        }

        @Override
        public int getVersion() {
          return 0;
        }

        @Override
        public Proxy buildProxy(org.chromium.mojo.system.Core core,
                                org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override
        public Stub buildStub(org.chromium.mojo.system.Core core, FindInPageClient impl) {
            return new Stub(core, impl);
        }

        @Override
        public FindInPageClient[] buildArray(int size) {
          return new FindInPageClient[size];
        }
    };


    private static final int SET_NUMBER_OF_MATCHES_ORDINAL = 0;

    private static final int SET_ACTIVE_MATCH_ORDINAL = 1;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements FindInPageClient.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void setNumberOfMatches(
int requestId, int numberOfMatches, int updateType) {

            FindInPageClientSetNumberOfMatchesParams _message = new FindInPageClientSetNumberOfMatchesParams();

            _message.requestId = requestId;

            _message.numberOfMatches = numberOfMatches;

            _message.updateType = updateType;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(SET_NUMBER_OF_MATCHES_ORDINAL)));

        }


        @Override
        public void setActiveMatch(
int requestId, org.chromium.gfx.mojom.Rect activeMatchRect, int activeMatchOrdinal, int updateType) {

            FindInPageClientSetActiveMatchParams _message = new FindInPageClientSetActiveMatchParams();

            _message.requestId = requestId;

            _message.activeMatchRect = activeMatchRect;

            _message.activeMatchOrdinal = activeMatchOrdinal;

            _message.updateType = updateType;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(SET_ACTIVE_MATCH_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<FindInPageClient> {

        Stub(org.chromium.mojo.system.Core core, FindInPageClient impl) {
            super(core, impl);
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(org.chromium.mojo.bindings.MessageHeader.NO_FLAG)) {
                    return false;
                }
                switch(header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_OR_CLOSE_PIPE_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRunOrClosePipe(
                                FindInPageClient_Internal.MANAGER, messageWithHeader);





                    case SET_NUMBER_OF_MATCHES_ORDINAL: {

                        FindInPageClientSetNumberOfMatchesParams data =
                                FindInPageClientSetNumberOfMatchesParams.deserialize(messageWithHeader.getPayload());

                        getImpl().setNumberOfMatches(data.requestId, data.numberOfMatches, data.updateType);
                        return true;
                    }





                    case SET_ACTIVE_MATCH_ORDINAL: {

                        FindInPageClientSetActiveMatchParams data =
                                FindInPageClientSetActiveMatchParams.deserialize(messageWithHeader.getPayload());

                        getImpl().setActiveMatch(data.requestId, data.activeMatchRect, data.activeMatchOrdinal, data.updateType);
                        return true;
                    }


                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }

        @Override
        public boolean acceptWithResponder(org.chromium.mojo.bindings.Message message, org.chromium.mojo.bindings.MessageReceiver receiver) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG)) {
                    return false;
                }
                switch(header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRun(
                                getCore(), FindInPageClient_Internal.MANAGER, messageWithHeader, receiver);






                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class FindInPageClientSetNumberOfMatchesParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int requestId;
        public int numberOfMatches;
        public int updateType;

        private FindInPageClientSetNumberOfMatchesParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public FindInPageClientSetNumberOfMatchesParams() {
            this(0);
        }

        public static FindInPageClientSetNumberOfMatchesParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static FindInPageClientSetNumberOfMatchesParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static FindInPageClientSetNumberOfMatchesParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            FindInPageClientSetNumberOfMatchesParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new FindInPageClientSetNumberOfMatchesParams(elementsOrVersion);
                    {
                        
                    result.requestId = decoder0.readInt(8);
                    }
                    {
                        
                    result.numberOfMatches = decoder0.readInt(12);
                    }
                    {
                        
                    result.updateType = decoder0.readInt(16);
                        FindMatchUpdateType.validate(result.updateType);
                    }

            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            
            encoder0.encode(this.requestId, 8);
            
            encoder0.encode(this.numberOfMatches, 12);
            
            encoder0.encode(this.updateType, 16);
        }
    }



    
    static final class FindInPageClientSetActiveMatchParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 32;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(32, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int requestId;
        public org.chromium.gfx.mojom.Rect activeMatchRect;
        public int activeMatchOrdinal;
        public int updateType;

        private FindInPageClientSetActiveMatchParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public FindInPageClientSetActiveMatchParams() {
            this(0);
        }

        public static FindInPageClientSetActiveMatchParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static FindInPageClientSetActiveMatchParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static FindInPageClientSetActiveMatchParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            FindInPageClientSetActiveMatchParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new FindInPageClientSetActiveMatchParams(elementsOrVersion);
                    {
                        
                    result.requestId = decoder0.readInt(8);
                    }
                    {
                        
                    result.activeMatchOrdinal = decoder0.readInt(12);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                    result.activeMatchRect = org.chromium.gfx.mojom.Rect.decode(decoder1);
                    }
                    {
                        
                    result.updateType = decoder0.readInt(24);
                        FindMatchUpdateType.validate(result.updateType);
                    }

            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            
            encoder0.encode(this.requestId, 8);
            
            encoder0.encode(this.activeMatchOrdinal, 12);
            
            encoder0.encode(this.activeMatchRect, 16, false);
            
            encoder0.encode(this.updateType, 24);
        }
    }



}
