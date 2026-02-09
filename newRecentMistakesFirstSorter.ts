

export class NewRecentMistakesFirstSorter {
    organize(cards: any[]): any[] {
        const incorrectCards: any[] = [];
        const correctCards: any[] = [];

        for (const card of cards) {
            if (card.wasAnsweredIncorrectlyLastRound()) {
                incorrectCards.push(card);
            } else {
                correctCards.push(card);
            }
        }

        return incorrectCards.concat(correctCards);
    }
}

const mockCards = [
    {
        id: 1,
        question: "Card A",
        wasAnsweredIncorrectlyLastRound: () => false
    },
    {
        id: 2,
        question: "Card B", 
        wasAnsweredIncorrectlyLastRound: () => true  // أجيب عليها خطأ
    },
    {
        id: 3,
        question: "Card C",
        wasAnsweredIncorrectlyLastRound: () => false
    },
    {
        id: 4,
        question: "Card D",
        wasAnsweredIncorrectlyLastRound: () => true  // أجيب عليها خطأ
    }
];


const sorter = new NewRecentMistakesFirstSorter();
const sortedCards = sorter.organize(mockCards);


console.log("البطاقات بعد الترتيب:");
sortedCards.forEach(card => {
    console.log(`- ${card.question} (ID: ${card.id})`);
});

console.log("\nالبطاقات التي أجيب عليها خطأ تظهر أولاً:");
console.log(sortedCards.map(card => card.question).join(", "));