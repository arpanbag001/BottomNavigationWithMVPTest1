package com.innovationredefined.bottomnavigationwithmvptest1.data;

import java.util.HashMap;

public class Database {
    private HashMap<String, String> data = new HashMap<>();

    public Database() {
        data.put("Home", "A home page is generally the main page a visitor navigating to a website from a web search engine will see, and it may also serve as a landing page to attract visitors.[1][2] The home page is used to facilitate navigation to other pages on the site by providing links to prioritized and recent articles and pages, and possibly a search box.[3] For example, a news website may present headlines and first paragraphs of top stories, with links to full articles, in a dynamic web page that reflects the popularity and recentness of stories.[4] Meanwhile, other websites use the homepage to attract users to create an account. Once they are logged in, the homepage may be redirected to their profile page. This may in turn be referred to as the \"personal home page\".[5]\n" +
                "\n" +
                "A website may have multiple home pages, although most have one.[6] Wikipedia, for example, has a home page at wikipedia.org, as well as language-specific home pages, such as en.wikipedia.org and de.wikipedia.org.");

        data.put("Search", "A web search engine is a software system that is designed to search for information on the World Wide Web. The search results are generally presented in a line of results often referred to as search engine results pages (SERPs). The information may be a mix of web pages, images, and other types of files. Some search engines also mine data available in databases or open directories. Unlike web directories, which are maintained only by human editors, search engines also maintain real-time information by running an algorithm on a web crawler. Internet content that is not capable of being searched by a web search engine is generally described as the deep web.");

        data.put("Profile", "A user profile is a visual display of personal data associated with a specific user, or a customized desktop environment. A profile refers therefore to the explicit digital representation of a person's identity. A user profile can also be considered as the computer representation of a user model.\n" +
                "\n" +
                "A profile can be used to store the description of the characteristics of person. This information can be exploited by systems taking into account the persons' characteristics and preferences.\n" +
                "\n" +
                "Profiling is the process that refers to construction of a profile via the extraction from a set of data.\n" +
                "\n" +
                "User profiles can be found on operating systems, computer programs, recommender systems, or dynamic websites (such as online social networking sites or bulletin boards).");

        data.put("Browse", "Browsing is a kind of orienting strategy. It is supposed to identify something of relevance for the browsing organism. When used about human beings it is a metaphor taken from the animal kingdom. It is used, for example, about people browsing open shelves in libraries, window shopping, or browsing databases or the Internet. In library and information science it is an important subject, both purely theoretically and as applied science aiming at designing interfaces which support browsing activities for the user.");
    }

    public String getDataFromDatabase(String key) {
        return data.get(key);
    }
}
