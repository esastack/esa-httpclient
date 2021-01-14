/*
 * Copyright 2020 OPPO ESA Stack Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package esa.httpclient.core.exception;

import java.net.ConnectException;

public class WriteBufFullException extends ConnectException {

    public static final WriteBufFullException INSTANCE =
            new WriteBufFullException("Connection write buffer is full");

    private static final long serialVersionUID = -2964248671411414742L;

    private WriteBufFullException(String msg) {
        super(msg);
    }
}
