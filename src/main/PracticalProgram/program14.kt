fun main(args: Array<String>) {
    // Get the sentence from the user.
    println("Enter a sentence: ")
    val sentence = readLine()!!

    // Initialize the number of vowels and consonants.
    var vowels = 0
    var consonants = 0

    // Iterate over the characters in the sentence.
    for (c in sentence) {
        // Check if the character is a vowel.
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            vowels++
        } else {
            consonants++
        }
    }

    // Print the results.
    println("The number of vowels in the sentence is $vowels.")
    println("The number of consonants in the sentence is $consonants.")
}