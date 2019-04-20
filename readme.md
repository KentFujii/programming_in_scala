docker pull hseeberger/scala-sbt
docker run -it --rm hseeberger/scala-sbt

## 設計

`sbt new scala/scala-seed.g8`

ベースディレクトリ/
  各プロジェクトがそれぞれ用意される
project/
  設定ファイルを置くディレクトリ
target/
  コンパイルするバイナリを置くディレクトリ

## memo

https://www.scala-sbt.org/0.13/docs/Hello.html
https://github.com/deanwampler/prog-scala-2nd-ed-code-examples
https://github.com/vishallama/programming-in-scala-3rd-ed
http://eed3si9n.github.io/sbt-getting-started-guide-ja/multi-project/
