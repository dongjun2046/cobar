/*
 * Copyright 1999-2012 Alibaba Group.
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
package com.alibaba.cobar.server.handler;

import java.nio.ByteBuffer;

import com.alibaba.cobar.net.mysql.OkPacket;
import com.alibaba.cobar.server.ServerConnection;

/**
 * @author xianmao.hexm
 */
public final class CommitHandler {

    public static void handle(ServerConnection c) {
        ByteBuffer buffer = c.allocate();
        c.writeAllToBuffer(OkPacket.OK, buffer);
    }

}
