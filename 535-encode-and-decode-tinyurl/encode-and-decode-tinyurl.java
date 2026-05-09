public class Codec {

     HashMap<String, String> map = new HashMap<>();
    int id = 0;

    // Encodes a URL to a shortened URL
    public String encode(String longUrl) {
        String shortUrl = "http://tinyurl.com/" + id;
        map.put(shortUrl, longUrl);
        id++;
        return shortUrl;
    }

    // Decodes a shortened URL to original URL
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));