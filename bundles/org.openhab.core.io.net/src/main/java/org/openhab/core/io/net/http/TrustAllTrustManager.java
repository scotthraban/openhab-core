/**
 * Copyright (c) 2010-2023 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.core.io.net.http;

import java.net.Socket;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedTrustManager;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;

/**
 * The {@link TrustAllTrustManager} is a "trust all" implementation of {@link X509ExtendedTrustManager}.
 *
 * @author Matthew Bowman - Initial contribution
 */
@NonNullByDefault
public final class TrustAllTrustManager extends X509ExtendedTrustManager {

    private static TrustAllTrustManager instance = new TrustAllTrustManager();

    public static TrustAllTrustManager getInstance() {
        return instance;
    }

    /**
     * private construction - singleton
     */
    private TrustAllTrustManager() {
    }

    @Override
    public void checkClientTrusted(X509Certificate @Nullable [] chain, @Nullable String authType)
            throws CertificateException {
    }

    @Override
    public void checkServerTrusted(X509Certificate @Nullable [] chain, @Nullable String authType)
            throws CertificateException {
    }

    @Override
    public X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }

    @Override
    public void checkClientTrusted(X509Certificate @Nullable [] chain, @Nullable String authType,
            @Nullable Socket socket) throws CertificateException {
    }

    @Override
    public void checkClientTrusted(X509Certificate @Nullable [] chain, @Nullable String authType,
            @Nullable SSLEngine engine) throws CertificateException {
    }

    @Override
    public void checkServerTrusted(X509Certificate @Nullable [] chain, @Nullable String authType,
            @Nullable Socket socket) throws CertificateException {
    }

    @Override
    public void checkServerTrusted(X509Certificate @Nullable [] chain, @Nullable String authType,
            @Nullable SSLEngine engine) throws CertificateException {
    }
}
