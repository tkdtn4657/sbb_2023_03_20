# DB 생성
DROP DATABASE IF EXISTS sbb__dev;
CREATE DATABASE sbb__dev;
USE sbb__dev;




# 각 테이블 초기화(꼭 answer 먼저 삭제 이유는 두 테이블간 외래키가 걸려이기 때문에)

TRUNCATE answer;
TRUNCATE question;