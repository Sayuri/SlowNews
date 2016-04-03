import java.util.ArrayList;

public class NewsList {
    private static ArrayList<News> list = new ArrayList();

    public static ArrayList<News> getNews() {
        if (list.size() == 0) {
            generateNews();
        }
        for (News news : list) {
            for (News archivedNews : NewsArchive.news) {
                if (news.getTopic().equals(archivedNews.getTopic())) {
                    news.setArchiveStatus("Archived");
                }
            }
        }
        return list;
    }

    public static void setNews(ArrayList<News> news) {
        NewsList.list = news;
    }

    public static void add(News news) {
        list.add(news);
    }

    private static void generateNews() {
        News news1 = new News("http://ichef.bbci.co.uk/wwfeatures/1600_900/images/live/p0/3n/07/p03n0731.jpg", "Monkeys",
                "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium," +
                        " totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae " +
                        "vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit " +
                        "aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. " +
                        "Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, " +
                        "sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat " +
                        "voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit " +
                        "laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit " +
                        "qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum " +
                        "fugiat quo voluptas nulla pariatur?At vero eos et accusamus et iusto odio dignissimos " +
                        "ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias " +
                        "excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt " +
                        "mollitia animi, id est laborum et dolorum fuga. Et harum quidem rerum facilis est et expedita " +
                        "distinctio. Nam libero tempore, cum soluta nobis est eligendi optio cumque nihil impedit quo minus " +
                        "id quod maxime placeat facere possimus, omnis voluptas assumenda est, omnis dolor repellendus. " +
                        "Temporibus autem quibusdam et aut officiis debitis aut rerum necessitatibus saepe eveniet ut et " +
                        "voluptates repudiandae sint et molestiae non recusandae. Itaque earum rerum hic tenetur a sapiente " +
                        "delectus, ut aut reiciendis voluptatibus maiores alias consequatur aut perferendis doloribus " +
                        "asperiores repellat.");
        News news2 = new News("https://www.eliquidukstore.com/wp-content/uploads/2014/03/banana-e-liquid.jpeg", "Bananas",
                "The banana is an edible fruit, botanically a berry,[1][2] produced by several kinds of " +
                        "large herbaceous, flowering plants in the genus Musa.[3] In some countries, bananas used for " +
                        "cooking may be called plantains. The fruit is variable in size, color, and firmness, but is " +
                        "usually elongated and curved, with soft flesh rich in starch covered with a rind which may be " +
                        "green, yellow, red, purple, or brown when ripe. The fruits grow in clusters hanging from the " +
                        "top of the plant. Almost all modern edible parthenocarpic (seedless) bananas come from two " +
                        "wild species – Musa acuminata and Musa balbisiana. The scientific names of most cultivated " +
                        "bananas are Musa acuminata, Musa balbisiana, and Musa × paradisiaca for the hybrid Musa " +
                        "acuminata × M. balbisiana, depending on their genomic constitution. The old scientific name " +
                        "Musa sapientum is no longer used.");
        list.add(news1);
        list.add(news2);
    }
}
