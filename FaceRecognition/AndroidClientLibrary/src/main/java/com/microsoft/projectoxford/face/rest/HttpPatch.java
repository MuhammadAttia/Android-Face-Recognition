// Copyright (c) Microsoft. All rights reserved.

package com.microsoft.projectoxford.face.rest;

import org.apache.http.client.methods.HttpPost;

public class HttpPatch extends HttpPost {
    public static final String METHOD_PATCH = "PATCH";

    public HttpPatch(final String url) {
        super(url);
    }

    @Override
    public String getMethod() {
        return METHOD_PATCH;
    }
}
