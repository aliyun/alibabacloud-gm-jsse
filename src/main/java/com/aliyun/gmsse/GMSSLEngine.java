package com.aliyun.gmsse;

import java.nio.ByteBuffer;

import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLEngineResult.HandshakeStatus;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

public class GMSSLEngine extends SSLEngine {

    private boolean needClientAuth;
    private boolean useClientMode;

    @Override
    public void beginHandshake() throws SSLException {
        // TODO Auto-generated method stub

    }

    @Override
    public void closeInbound() throws SSLException {
        // TODO Auto-generated method stub

    }

    @Override
    public void closeOutbound() {
        // TODO Auto-generated method stub

    }

    @Override
    public Runnable getDelegatedTask() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean getEnableSessionCreation() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String[] getEnabledCipherSuites() {
        return sslParameters.getCipherSuites();
    }

    @Override
    public String[] getEnabledProtocols() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public HandshakeStatus getHandshakeStatus() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean getNeedClientAuth() {
        return needClientAuth;
    }

    @Override
    public SSLSession getSession() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String[] getSupportedCipherSuites() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String[] getSupportedProtocols() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean getUseClientMode() {
        return useClientMode;
    }

    @Override
    public boolean getWantClientAuth() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isInboundDone() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isOutboundDone() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void setEnableSessionCreation(boolean arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setEnabledCipherSuites(String[] arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setEnabledProtocols(String[] arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setNeedClientAuth(boolean need) {
        this.needClientAuth = need;
    }

    @Override
    public void setUseClientMode(boolean arg0) {
        this.useClientMode = true;
    }

    @Override
    public void setWantClientAuth(boolean arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public SSLEngineResult unwrap(ByteBuffer arg0, ByteBuffer[] arg1, int arg2, int arg3) throws SSLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public SSLEngineResult wrap(ByteBuffer[] arg0, int arg1, int arg2, ByteBuffer arg3) throws SSLException {
        // TODO Auto-generated method stub
        return null;
    }

}
