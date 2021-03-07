package me.farhan.indonesianpresidents.data

import me.farhan.indonesianpresidents.model.President

/**
 * @author farhan
 * created at at 13:54 on 07/03/21.
 */
fun getData(): ArrayList<President> {
    val presidents = ArrayList<President>()
    presidents.add(
        President(
            "Soekarno",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e3/Sukarno%2C_Sang_Saka_Melanglang_Djagad%2C_p12.jpg/220px-Sukarno%2C_Sang_Saka_Melanglang_Djagad%2C_p12.jpg"
        )
    )
    presidents.add(
        President(
            "Soeharto",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b1/President_Suharto%2C_1983.jpg/170px-President_Suharto%2C_1983.jpg"
        )
    )
    presidents.add(
        President(
            "B.J. Habibie",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "https://content.shopback.com/id/wp-content/uploads/2019/09/13142759/biografi-BJ-Habibie.jpg"
        )
    )
    presidents.add(
        President(
            "Abdurrachman Wahid",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "https://upload.wikimedia.org/wikipedia/commons/3/35/President_Abdurrahman_Wahid_-_Indonesia.jpg"
        )
    )
    presidents.add(
        President(
            "Megawati Soekarno Putri",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "https://asset.kompas.com/crops/uL4NK69t9kzPsTiq-hCCOqXNE1w=/554x0:2174x1080/750x500/data/photo/2020/08/17/5f3a19cb4bf9c.jpg"
        )
    )
    presidents.add(
        President(
            "Susilo Bambang Yudhoyono",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "https://cdns.klimg.com/merdeka.com/i/w/tokoh/2012/01/11/457/200x300/susilo-bambang-yudhoyono.jpg"
        )
    )
    presidents.add(
        President(
            "Joko Widodo",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "https://images.squarespace-cdn.com/content/51e3ae56e4b0ebae3ad28b2b/1401274652874-XTB10YORH7B7IOW5TQTO/image-asset.jpeg?content-type=image%2Fjpeg"
        )
    )

    return presidents
}