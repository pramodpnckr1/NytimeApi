package com.nytimes.articles.view.callbacks;

import com.nytimes.articles.data.local.entity.ArticleEntity;

/**
 * File Description
 * Author: PRAMOD K P
 * Email: pramodpnckr@gmail.com
 * Created: 3/28/2019
 * Modified: 3/28/2019
 */
public interface ArticleListCallback {
    void onArticleClicked(ArticleEntity articleEntity);
}

