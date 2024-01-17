def call(Map config = [:]) {
  sh "echo hi ${config.name}, i wsh you ${config.wish}."
}
