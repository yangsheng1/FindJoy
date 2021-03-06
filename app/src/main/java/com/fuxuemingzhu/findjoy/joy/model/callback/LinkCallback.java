package com.fuxuemingzhu.findjoy.joy.model.callback;


import com.jude.http.RequestListener;

/**
 * Created by Mr.fuxuemingzhu on 2015/6/13.
 */
class LinkCallback implements RequestListener {
    private com.fuxuemingzhu.findjoy.model.callback.LinkCallback link;

    public com.fuxuemingzhu.findjoy.model.callback.LinkCallback add(com.fuxuemingzhu.findjoy.model.callback.LinkCallback other) {
        //other.setLink(this);
        return other;
    }

    private void setLink(com.fuxuemingzhu.findjoy.model.callback.LinkCallback link) {
        this.link = link;
    }

    @Override
    public void onRequest() {
        if (link != null)
            link.onRequest();
    }

    @Override
    public void onSuccess(String s) {
        if (link != null)
            link.onSuccess(s);
    }

    @Override
    public void onError(String s) {
        if (link != null)
            link.onError(s);
    }
}
