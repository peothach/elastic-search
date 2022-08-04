# elastic-search

#### Setup: 

docker pull docker.elastic.co/elasticsearch/elasticsearch:8.3.1

docker run -d --name es01 --net elastic -p 9200:9200 -p 9300:9300 -e "discovery.type=single-node" docker.elastic.co/elasticsearch/elasticsearch:8.3.1

docker exec -it es01 /usr/share/elasticsearch/bin/elasticsearch-reset-password

docker cp es01:/usr/share/elasticsearch/config/certs/http_ca.crt .

curl --cacert http_ca.crt -u elastic https://localhost:9200

#### Reference: 

https://www.youtube.com/watch?v=XPaMFaiLKhE

https://www.elastic.co/guide/en/elasticsearch/reference/current/docker.html#elasticsearch-security-certificates

https://medium.com/shoutloudz/what-is-elastic-search-how-to-use-it-with-spring-boot-36c6bb32e22f
