/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kelsey
 */
@WebServlet(urlPatterns = {"/SurrealistServlet"})
public class SurrealistServlet extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("entrySurreal.jsp");
        rd.forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String artist = request.getParameter("artist");
        String info = getArtistInfo(artist);
        String url = getImageURL(artist);
        String art = getPaintingURL(artist);

        request.setAttribute("imageURL", url);
        request.setAttribute("info", info);
        request.setAttribute("art", art);

        RequestDispatcher rd = request.getRequestDispatcher("response.jsp");

        rd.forward(request, response);

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    public String getArtistInfo(String artist) {
        artist = artist.toLowerCase();
        String info = null;
        switch (artist) {
            case "max ernst":
                info = "Max Ernst (2 April 1891 – 1 April 1976) was a "
                        + "German painter, sculptor, graphic artist, and "
                        + "poet. A prolific artist, Ernst was a primary "
                        + "pioneer of the Dada movement and Surrealism.\n"
                        + "\nMax Ernst was born in Brühl, near Cologne, "
                        + "the third of nine children of a middle-class Catholic family. "
                        + "His father Philipp was a teacher of the deaf and an amateur painter, "
                        + "a devout Christian and a strict disciplinarian. He inspired in Max "
                        + "a penchant for defying authority, while his interest in painting "
                        + "and sketching in nature influenced Max to take up painting himself. "
                        + "In 1909 Ernst enrolled in the University of Bonn, studying philosophy, "
                        + "art history, literature, psychology and psychiatry. He visited asylums "
                        + "and became fascinated with the art of the mentally ill patients; "
                        + "he also started painting that year, producing sketches in the garden "
                        + "of the Brühl castle, and portraits of his sister and himself. "
                        + "In 1911 Ernst befriended August Macke and joined his Die Rheinischen "
                        + "Expressionisten group of artists, deciding to become an artist. In "
                        + "1912 he visited the Sonderbund exhibition in Cologne, where works by "
                        + "Pablo Picasso and post-Impressionists such as Vincent van Gogh and Paul "
                        + "Gauguin profoundly influenced his approach to art. His own work was "
                        + "exhibited the same year together with that of the Das Junge Rheinland "
                        + "group, at Galerie Feldman in Cologne, and then in several group exhibitions in 1913.\n"
                        + "\n"
                        + "In 1914 Ernst met Hans Arp in Cologne. The two soon became friends and their relationship lasted for fifty years. After Ernst completed his studies in the summer, his life was interrupted by World War I. Ernst was drafted and served both on the Western and the Eastern front. Such was the devastating effect of the war on the artist that in his autobiography he referred to his time in the army thus: \"On the first of August 1914 M[ax].E[rnst]. died. He was resurrected on the eleventh of November 1918.\" However, for a brief period on the Western Front, Ernst was assigned to chart maps, which allowed him to continue painting.[1] Several German Expressionist painters died in action during the war, among them Macke and Franz Marc.";
                break;
            case "andre breton":
                info = "André Breton (9 February 1896 – 28 September 1966) "
                        + "was a French writer, poet, anarchist and anti-fascist. "
                        + "He is known best as the founder of Surrealism. "
                        + "His writings include the first Surrealist Manifesto "
                        + "(Manifeste du surréalisme) of 1924, in which he "
                        + "defined surrealism as \"pure psychic automatism\""
                        + "In 1919 Breton launched the review Littérature with Louis Aragon and Philippe Soupault. He also associated with Dadaist Tristan Tzara. In 1924 he was instrumental in the founding of the Bureau of Surrealist Research.\n"
                        + "\n"
                        + "In a publication The Magnetic Fields (Les Champs Magnétiques), a collaboration with Soupault, he implemented the principle of automatic writing. He published the Surrealist Manifesto in 1924, and was editor of the magazine La Révolution surréaliste from 1924. A group of writers became associated with him: Philippe Soupault, Louis Aragon, Paul Éluard, René Crevel, Michel Leiris, Benjamin Péret, Antonin Artaud, and Robert Desnos.\n"
                        + "\n"
                        + "Anxious to combine the themes of personal transformation found in the works of Arthur Rimbaud with the politics of Karl Marx, Breton joined the French Communist Party in 1927, from which he was expelled in 1933. During this time, he survived mostly by the sale of paintings from his art gallery.\n"
                        + "\n"
                        + "In 1935, there was a conflict between Breton and the Soviet writer and journalist Ilya Ehrenburg during the first \"International Congress of Writers for the Defense of Culture\" which opened in Paris in June. Breton had been insulted by Ehrenburg—along with all fellow surrealists—in a pamphlet which said, among other things, that surrealists were \"pederasts\". Breton slapped Ehrenburg several times on the street, which resulted in surrealists being expelled from the Congress. Crevel, who according to Salvador Dalí, was \"the only serious communist among surrealists\" [3] was isolated from Breton and other surrealists, who were unhappy with Crevel because of his homosexuality and annoyed with communists in general.\n"
                        + "\n"
                        + "In 1938, Breton accepted a cultural commission from the French government to travel to Mexico. After a conference at the National Autonomous University of Mexico about surrealism, Breton stated after getting lost in Mexico City (as no one was waiting for him at the airport) \"I don't know why I came here. Mexico is the most surrealist country in the world\".\n"
                        + "\n"
                        + "However, visiting Mexico provided the opportunity to meet Leon Trotsky. Breton and other surrealists traveled via a long boat ride from Patzcuaro to the town of Erongaricuaro. Diego Rivera and Frida Kahlo were among the visitors to the hidden community of intellectuals and artists. Together, Breton and Trotsky wrote a manifesto Pour un art révolutionnaire indépendent (published under the names of Breton and Diego Rivera) calling for \"complete freedom of art\", which was becoming increasingly difficult with the world situation of the time.";
                break;
                
            case "leonora carrington":
                info="Leonora Carrington (6 April 1917 – 25 May 2011) was a English-born Mexican artist, "
                        + "surrealist painter, and novelist. She lived most of her adult life in Mexico City, and was one of the last surviving participants in the Surrealist movement of the 1930s. Leonora Carrington was also a founding member "
                        + "of the Women’s Liberation Movement in Mexico during the 1970s."
                        + "\n In 1936, Leonora saw the work of the German surrealist Max Ernst at the International Surrealist Exhibition in London and was attracted to the Surrealist artist before she even met him. In 1937, Carrington met Ernst at a party held in London. The artists bonded and returned together to Paris, where Ernst promptly separated from his wife. In 1938, leaving Paris, they settled in Saint Martin d'Ardèche in southern France. The new couple collaborated and supported each other's artistic development. The two artists created sculptures of guardian animals (Ernst created his birds and Carrington created a plaster horse head) to decorate their home in Saint Martin d'Ardèche. In 1939, Carrington painted a portrait of Max Ernst, as a tribute to their relationship.\n" +
"\n" +
"With the outbreak of World War II Ernst, who was German, was arrested by the French authorities for being a \"hostile alien\". With the intercession of Paul Éluard, and other friends, including the American journalist Varian Fry, he was discharged a few weeks later.\n" +
"\n" +
"Soon after the Nazis invaded France, Ernst was arrested again, this time by the Gestapo, because his art was considered by the Nazis to be \"degenerate\". He managed to escape and, leaving Carrington behind, fled to America with the help of Peggy Guggenheim, who was a sponsor of the arts.\n" +
"\n" +
"After Ernst's arrest, Carrington was devastated and fled to Spain. Paralyzing anxiety and growing delusions culminated in a final breakdown at the British Embassy in Madrid. Her parents intervened and had her hospitalised. She was given \"convulsive therapy\" and was treated with the drugs cardiazol, a powerful anxiolytic drug (eventually banned by some authorities, including the US Food and Drug Administration (FDA)), and Luminal, a barbiturate.[13]\n" +
"\n" +
"After being released into the care of a nurse who took her to Lisbon, Carrington ran away and sought refuge in the Mexican Embassy. Meanwhile Ernst had married Peggy Guggenheim in New York in 1941. That marriage ended a few years later but Ernst and Carrington were unable to resume their relationship.\n" +
"\n" +
"Three years after being released from the asylum and with the encouragement of André Breton, Carrington wrote about her psychotic experience in her novel Down Below.She also created art to depict her experience, such as her Portrait of Dr. Morales and Map of Down Below.";
                break;
                
            case "dorothea tanning":
                info="Dorothea Tanning was born in 1910 in Galesburg, Illinois and attended Knox College in her hometown before studying painting in Chicago (haunting the Art Institute where she learned what painting was.)   In 1941, now in New York, she met the art dealer, Julien Levy, and his surrealist friends, refugees from Nazi occupied France. Late in 1942 Max Ernst visited her studio, saw a painting, (Birthday), and stayed to play chess. They would have 34 years together, at first in Sedona, Arizona (a mere outpost at the time).  Here she would continue to paint her enigmatic versions of life on the inside, looking out: The Guest Room, The Truth About Comets, Eine Kleine Nachtmusik, Interior with Sudden Joy, Insomnias, Palaestra, Tamerlane, Far From. By 1956 Max and Dorothea had chosen to live and work thenceforth in France. Though Paris was headquarters, they preferred the country quiet lure in Touraine and Provence. These years included, for Dorothea Tanning, an intense five‐year adventure in soft sculpture: Cousins, Don Juan's Breakfast, Fetish, Rainy Day Canapé, Tragic Table, Verb, Xmas, Emma, Revelation or the End of the Month, Hôtel du Pavot Room 202.\n" +
"\n" +
"Max Ernst died on April 1, 1976 and Dorothea faced a solitary future. “Go home,” said the paint tubes, the canvases, the brushes. Returning to the United States in the late 1970s, and still painting, Tango Lives, Woman Artist, On Avalon, Door 84, Still in the Studio, Blue Mom, Dionysos S.O.S., she gave full rein to her long felt compulsion to write.  Words, poetry.  Written, read, heard.  Would she join these voices even then? Her poems have since appeared in a number of literary reviews and magazines, such as The Yale Review, Poetry, The Paris Review, The New Yorker, The Boston Review, The Southwest Review, Parnassus, and in Best Poems of 2002 and 2005. Her published works include two memoirs, Birthday and Between Lives, a collection of poems, A Table of Content, and a novel, Chasm.";
                break;

            case "remedios varo":
                info="Remedios Varo Uranga (December 16, 1908 – October 8, 1963) was a Spanish-Mexican para-surrealist painter and anarchist.\n" +
"\n" +
"She was born María de los Remedios Alicia Rodriga Varo y Uranga in Anglès, a small town in the province of Girona, Spain in 1908. Her birth helped her mother get over the death of another daughter, which is the reason behind the name. In 1924 she studied at the Real Academia de Bellas Artes de San Fernando, Madrid. During the Spanish Civil War she fled to Paris where she was greatly influenced by the surrealist movement. She met her second husband (after her death it was discovered that she had never divorced her first husband, painter Gerardo Lizarraga), the French surrealist poet Benjamin Péret, in Barcelona. There she was a member of the art group Logicophobiste. Due to her Republican ties, her 1937 move to Paris with Péret ensured that she would never be able to return to Franco's Spain. She was forced into exile from Paris during the German occupation of France and moved to Mexico City at the end of 1941. She died at the height of her career from a heart attack in Mexico City in 1963."
                        + "In 1941, she left Europe for Mexico because of World War II, arriving in the country with Péret as part of the wave of Spanish refugees.[2] She initially considered Mexico a temporary haven, but would remain in Mexico for the rest of her life. She started in commercial art. and did not begin painting until three years after settling in Mexico. It took another nine years before her first exhibition.\n" +
"\n" +
"In Mexico, she met regularly with other European artists such as Gunther Gerzso, Kati Horna, José Horna, and Wolfgang Paalen. In Mexico, she met native artists such as Frida Kahlo and Diego Rivera, but her strongest ties were to other exiles and expatriates, notably the English painter Leonora Carrington and the French pilot and adventurer, Jean Nicolle. However, because Mexican muralism still dominated the country’s art scene, surrealism was not generally well received. She worked as an assistant to Marc Chagall with the design of the costumes for the production of the ballet Aleko, which premiered in Mexico City in 1942.\n" +
"\n" +
"She worked at other jobs including in publicity and decorating. In 1947, Péret returned to Paris, and Varo traveled to Venezuela, living there for two years.[1] She returned to Mexico and began her third and last important relationship with Austrian refugee Walter Gruen, who had endured concentration camps before escaping Europe. Gruen believed fiercely in Varo, and he gave her the economic and emotional support that allowed her to fully concentrate on her painting.[2] In 1955, Varo had her first individual exhibition at the Galería Diana in Mexico City, which was well received. One reason for this was that Mexico had opened up to other artistic trends. Buyers were put on waiting lists for her work. Even Diego Rivera was supportive. Her second showing was as the Salón de la Arte de Mujer in 1958. In 1960, her representative, Juan Martín, opened his own gallery and showed her work there, and opened a second in 1962, at the height of her career. Only a year after that opening, she died.[1][2] Her work is well-known in Mexico, but not as commonly known throughout the rest of the world.";
                break;
            case "salvador dali":
                info="Salvador Domingo Felipe Jacinto Dalí i Domènech, Marqués de Dalí de Pubol (11 May 1904 – 23 January 1989), known as Salvador Dalí (Catalan: [səɫβəˈðo ðəˈɫi]; Spanish: [salβaˈðoɾ ðaˈli]), was a prominent Spanish surrealist painter born in Figueres, Catalonia, Spain.\n" +
"\n" +
"Dalí was a skilled draftsman, best known for the striking and bizarre images in his surrealist work. His painterly skills are often attributed to the influence of Renaissance masters.[1][2] His best-known work, The Persistence of Memory, was completed in August 1931. Dalí's expansive artistic repertoire included film, sculpture, and photography, in collaboration with a range of artists in a variety of media.\n" +
"\n" +
"Dalí attributed his \"love of everything that is gilded and excessive, my passion for luxury and my love of oriental clothes\"[3] to an \"Arab lineage\", claiming that his ancestors were descended from the Moors.\n" +
"\n" +
"Dalí was highly imaginative, and also enjoyed indulging in unusual and grandiose behavior. His eccentric manner and attention-grabbing public actions sometimes drew more attention than his artwork, to the dismay of those who held his work in high esteem, and to the irritation of his critics."
                        + "In 1929, Dalí collaborated with surrealist film director Luis Buñuel on the short film Un Chien Andalou (An Andalusian Dog). His main contribution was to help Buñuel write the script for the film. Dalí later claimed to have also played a significant role in the filming of the project, but this is not substantiated by contemporary accounts.[22] Also, in August 1929, Dalí met his lifelong and primary muse, inspiration, and future wife Gala,[23] born Elena Ivanovna Diakonova. She was a Russian immigrant ten years his senior, who at that time was married to surrealist poet Paul Éluard. In the same year, Dalí had important professional exhibitions and officially joined the Surrealist group in the Montparnasse quarter of Paris. His work had already been heavily influenced by surrealism for two years. The Surrealists hailed what Dalí called his paranoiac-critical method of accessing the subconscious for greater artistic creativity.[8][9]\n" +
"\n" +
"Meanwhile, Dalí's relationship with his father was close to rupture. Don Salvador Dalí y Cusi strongly disapproved of his son's romance with Gala, and saw his connection to the Surrealists as a bad influence on his morals. The final straw was when Don Salvador read in a Barcelona newspaper that his son had recently exhibited in Paris a drawing of the Sacred Heart of Jesus Christ, with a provocative inscription: \"Sometimes, I spit for fun on my mother's portrait\".[5][24]\n" +
"\n" +
"Outraged, Don Salvador demanded that his son recant publicly. Dalí refused, perhaps out of fear of expulsion from the Surrealist group, and was violently thrown out of his paternal home on December 28, 1929. His father told him that he would be disinherited, and that he should never set foot in Cadaqués again. The following summer, Dalí and Gala rented a small fisherman's cabin in a nearby bay at Port Lligat. He bought the place, and over the years enlarged it by buying the neighbouring fishermen cabins, gradually building his much beloved villa by the sea. Dalí's father would eventually relent and come to accept his son's companion.";
                break;
                
            case "rene magritte":
                info="René François Ghislain Magritte (French: [ʁəne fʁɑ̃swa ɡilɛ̃ maɡʁit]; 21 November 1898 – 15 August 1967) was a Belgian surrealist artist. He became well known for a number of witty and thought-provoking images that fall under the umbrella of surrealism. His work is known for challenging observers' preconditioned perceptions of reality."
                        + "Magritte's earliest paintings, which date from about 1915, were Impressionistic in style.[2] From 1916 to 1918, he studied at the Académie Royale des Beaux-Arts in Brussels, under Constant Montald, but found the instruction uninspiring. The paintings he produced during the years 1918–1924 were influenced by Futurism and by the figurative Cubism of Metzinger.[2] In 1922, Magritte married Georgette Berger, whom he had met as a child in 1913.[1] From December 1920 until September 1921, Magritte served in the Belgian infantry in the Flemish town of Beverlo near Leopoldsburg. In 1922–23, he worked as a draughtsman in a wallpaper factory, and was a poster and advertisement designer until 1926, when a contract with Galerie 'Le Centaure' in Brussels made it possible for him to paint full-time. In 1926, Magritte produced his first surreal painting, The Lost Jockey (Le jockey perdu), and held his first exhibition in Brussels in 1927. Critics heaped abuse on the exhibition. Depressed by the failure, he moved to Paris where he became friends with André Breton, and became involved in the surrealist group. The illusionistic, dream-like quality is characteristic of Magritte's version of Surrealism. He became a leading member of the movement after leaving his native Belgium in 1927 for Paris, where he stayed for three years.[4]\n" +
"\n" +
"Galerie 'Le Centaure' closed at the end of 1929, ending Magritte's contract income. Having made little impact in Paris, Magritte returned to Brussels in 1930 and resumed working in advertising.[5] He and his brother, Paul, formed an agency which earned him a living wage.\n" +
"\n" +
"During the early stages of his career, the British surrealist patron Edward James allowed Magritte to stay rent free in his London home and paint. James is featured in two of Magritte's works, Le Principe du Plaisir (The Pleasure Principle) and La Reproduction Interdite, a painting also known as Not to be Reproduced.[6]\n" +
"\n" +
"During the German occupation of Belgium in World War II he remained in Brussels, which led to a break with Breton. He briefly adopted a colorful, painterly style in 1943–44, an interlude known as his \"Renoir Period\", as a reaction to his feelings of alienation and abandonment that came with living in German-occupied Belgium. In 1946, renouncing the violence and pessimism of his earlier work, he joined several other Belgian artists in signing the manifesto Surrealism in Full Sunlight.[7] During 1947–48, Magritte's \"Vache Period\", he painted in a provocative and crude Fauve style. During this time, Magritte supported himself through the production of fake Picassos, Braques and Chiricos—a fraudulent repertoire he was later to expand into the printing of forged banknotes during the lean postwar period. This venture was undertaken alongside his brother Paul Magritte and fellow Surrealist and 'surrogate son' Marcel Mariën, to whom had fallen the task of selling the forgeries.[8] At the end of 1948, he returned to the style and themes of his prewar surrealistic art.\n" +
"\n" +
"His work was exhibited in the United States in New York in 1936 and again in that city in two retrospective exhibitions, one at the Museum of Modern Art in 1965, and the other at the Metropolitan Museum of Art in 1992.\n" +
"\n" +
"Politically, Magritte stood to the left, and retained close ties to the Communist Party, even in the post-war years. However, he was critical of the functionalist cultural policy of the communist left, stating that \"Class consciousness is as necessary as bread; but that does not mean that workers must be condemned to bread and water and that wanting chicken and champagne would be harmful. (...) For the Communist painter, the justification of artistic activity is to create pictures that can represent mental luxury\". While remaining committed to the political left, he thus advocated a certain autonomy of art.[9][10] On his religious views, Magritte was an agnostic.[11]\n" +
"\n" +
"Popular interest in Magritte's work rose considerably in the 1960s, and his imagery has influenced pop, minimalist and conceptual art.[12] In 2005 he came 9th in the Walloon version of De Grootste Belg (The Greatest Belgian); in the Flemish version he was 18th.";
                break;
            default:
                info = "Sorry we do not have any information on that artist"
                        + " at this time. Please try back later or "
                        + "contact a system adminstrator for more information.";
                break;
        }

        return info;
    }

    public String getPaintingURL(String artist) {
        artist = artist.toLowerCase();

        String toReturn = null;
        switch (artist) {
            case "max ernst":
                toReturn = "http://www.myartguides.com/art-basel-2013/media/k2/items/cache/45ff2190802f9793d44160c4e551925c_XL.jpg";
                break;
            case "leonora carrington":
                toReturn="https://surrealismfall2012.files.wordpress.com/2012/11/carrington.jpg";
                break;
                
            case "dorothea tanning":
                toReturn="http://3.bp.blogspot.com/-wp0JgZPY4LY/U86-_AulB9I/AAAAAAAEDQM/9Yh7hVt98X4/s1600/Dorothea+Tanning+-+Eine+Kleine+Nachtmusik,+1946.png";
                break;
            case "remedios varo":
                toReturn="http://www.eugenefischer.com/wp-content/uploads/2013/10/The-Creation-of-Birds.jpg";
                break;
            case "salvador dali":
                toReturn="http://2.bp.blogspot.com/-MUg26sL7UIU/UyxHsGfxr8I/AAAAAAAAZZ8/3sMvf1EY1pc/s1600/dali-salvador-the-temptation-of-st-anthony.jpg";
                break;
            case "rene magritte":
                toReturn="http://www.renemagritte.org/images/paintings/the-collective-invention.jpg";
                break;
            default:
                toReturn="https://upload.wikimedia.org/wikipedia/commons/thumb/e/eb/Flag_of_Taliban_(original).svg/2000px-Flag_of_Taliban_(original).svg.png";
                break;
        }   

        return toReturn;
    }

    public String getImageURL(String artist) {
        artist = artist.toLowerCase();
        String toReturn = null;
        switch (artist) {
            case "max ernst":
                toReturn = "https://upload.wikimedia.org/wikipedia/en/3/3c/Max_Ernst%2C_1920%2C_Punching_Ball_ou_l%27Immortalit%C3%A9_de_Buonarroti%2C_photomontage%2C_gouache%2C_et_encre_sur_photographie.jpg";
                break;
            case "andre breton":
                toReturn="http://40.media.tumblr.com/cc804b948e5e7766b55303647da6ad48/tumblr_nvoil9Hm9F1qhgogbo1_540.jpg";
                break;
            case "leonora carrington":
                toReturn= "http://uploads4.wikiart.org/temp/2471ee37-714e-414f-8540-6a9f818f14a0.jpg";
                break;
            case "dorothea tanning":
                toReturn="http://www.dorotheatanning.org/images/work_image/ManRayDT1948.jpg";
                break;
            case "remedios varo":
                toReturn="http://c300221.r21.cf1.rackcdn.com/remedios-varo1908-1963-1353376174_org.jpeg";
                break;
            case "salvador dali":
                toReturn="http://uploads1.wikiart.org/images/salvador-dali.jpg!Portrait.jpg";
                break;
            case "rene magritte":
                toReturn="http://artradingfinance.com/wp-content/uploads/2015/05/159.-renemagritte.jpg";
                break;
            default:
                toReturn="http://uj.apertura.hu/wp-content/uploads/2012/12/10.jpg";
                break;
        }
        return toReturn;
    }
}
